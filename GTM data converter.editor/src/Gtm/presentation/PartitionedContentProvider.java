package Gtm.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.resource.ImageDescriptor;

import Gtm.actions.GtmUtils;

/**
 * This content provider works like a normal
 * {@link AdapterFactoryContentProvider} but limits the maximum number of
 * parent's child elements to a fixed size. If the number of child elements
 * exceeds this limit, virtual containers that contain all child elements are
 * created.
 * 
 * @author Wolfgang Geck
 */
public class PartitionedContentProvider extends AdapterFactoryContentProvider {

    //private final Image folderImage = new Image(Display.getCurrent(), PartitionedContentProvider.class.getResourceAsStream("virtual_folder.gif"));

    
    private Object folderImage = null; 
    
    protected final static int DEFAULT_FOLDER_SIZE = -1;

    private final Map<Object, VirtualFolderItemProvider[]> map = new WeakHashMap<Object, VirtualFolderItemProvider[]>();

    public PartitionedContentProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
        
        ImageDescriptor id = GtmUtils.getImageDescriptor("/icons/virtual_folder.gif");
        folderImage = id.createImage();
    }

    @Override
    public Object[] getChildren(Object object) {

        if (object instanceof VirtualFolderItemProvider) {
            return ((VirtualFolderItemProvider) object).createPartitionedArray(); // no list conversion
        }

        Object[] children = super.getChildren(object);

        int virtualFolderSize = getVirtualFolderSize(object);
        
        if (virtualFolderSize <= 0 || children.length <= virtualFolderSize) {
            return children;
        }

        if (map.get(object) == null) {

            map.put(object, splitChildren(children, (EObject) object, virtualFolderSize));
        }

        return map.get(object);

    }

    private VirtualFolderItemProvider[] splitChildren(Object[] children, EObject parent, int folderSize) {

        final List<VirtualFolderItemProvider> result = new ArrayList<VirtualFolderItemProvider>();

        int ceil = (int) Math.ceil(children.length / (double) folderSize);

        for (int i = 0; i < ceil; i++) {

            int startIndex = i * folderSize;
            int endIndex = Math.min(startIndex + folderSize, children.length);

            result.add(new VirtualFolderItemProvider(adapterFactory, parent, startIndex, endIndex, children));

        }

        return result.toArray(new VirtualFolderItemProvider[result.size()]);

    }

    @Override
    public Object getParent(Object object) {

        Object parent = super.getParent(object);

        if (getVirtualFolderSize(parent) > -1 && !(object instanceof PartitionedContentProvider)) {

            getChildren(parent);

            if (map.get(parent) != null) {

                for (VirtualFolderItemProvider provider : map.get(parent)) {

                    if (provider.contains(object)) {
                        return provider;
                    }

                }

            }

        }

        return parent;
    }

    @Override
    public void notifyChanged(Notification notification) {

        if (notification.getEventType() == Notification.ADD_MANY || notification.getEventType() == Notification.ADD || notification.getEventType() == Notification.REMOVE
                || notification.getEventType() == Notification.REMOVE_MANY || notification.getEventType() == Notification.MOVE) {

            map.remove(notification.getNotifier());
        }

        super.notifyChanged(notification);
    }

    @Override
    public void dispose() {
        map.clear();
        super.dispose();
    }

    /**
     * If given object has child elements, overwrite this method to set maximum number
     * of elements in a single virtual folder. If virtual folder size is
     * <b>-1</b> or number of children is less than virtual folder size child
     * elements are direct successors of parent.
     * 
     * @return Virtual folder size
     */
    protected int getVirtualFolderSize(Object parent) {
        return DEFAULT_FOLDER_SIZE;
    };

    /**
     * Item provider for virtual folders that contain the parent's child
     * elements.
     */
    private final class VirtualFolderItemProvider extends ItemProviderAdapter implements IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
            IEditingDomainItemProvider {

        private int startIndex;
        private int endIndex;
        private Object[] originalChildElements;
        private EObject parent;

        public VirtualFolderItemProvider(AdapterFactory adapterFactory, EObject parent, int startIndex, int endIndex, Object[] originalChildElements) {
            super(adapterFactory);
            this.parent = parent;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.originalChildElements = originalChildElements;
        }

        private boolean contains(Object object) {

            for (int i = startIndex; i < endIndex; i++) {
                if (object.equals(originalChildElements[i])) {
                    return true;
                }
            }

            return false;
        }

        private Object[] createPartitionedArray() {
            return Arrays.copyOfRange(originalChildElements, startIndex, endIndex);
        }

        @Override
        public boolean hasChildren(Object object) {
            return object instanceof VirtualFolderItemProvider;
        }

        @Override
        public Object getParent(Object object) {
            return ((VirtualFolderItemProvider) object).parent;
        }

        @Override
        public Object getImage(Object object) {
            return folderImage;
        }

        @Override
        public String getText(Object object) {
            return "[" + startIndex + " ... " + (endIndex - 1) + "]";
        }

    }

}