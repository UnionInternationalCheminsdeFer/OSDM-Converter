package Gtm.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

public class VirtualFolderItemProvider extends ItemProviderAdapter implements IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
            IEditingDomainItemProvider {

        private int startIndex;
        private int endIndex;
        private Object[] originalChildElements;
        private EObject parent;
        private Object folderImage;

        public VirtualFolderItemProvider(AdapterFactory adapterFactory, EObject parent, int startIndex, int endIndex, Object[] originalChildElements, Object folderImage) {
            super(adapterFactory);
            parent.eAdapters().add(this);
            this.parent = parent;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.originalChildElements = originalChildElements;
            this.folderImage = folderImage;
        }

        boolean contains(Object object) {

            for (int i = startIndex; i < endIndex; i++) {
                if (object.equals(originalChildElements[i])) {
                    return true;
                }
            }

            return false;
        }
        
        public Collection<Object> getFolderContent() {
        	Collection<Object> content = new ArrayList<Object>();
            for (int i = startIndex; i < endIndex; i++) {
                content.add(originalChildElements[i]);
            }
            return content;
        }

        Object[] createPartitionedArray() {
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
       
        @SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
        protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
        	if (object instanceof PartitionedContentProvider) {
            	super.collectNewChildDescriptors(newChildDescriptors, parent);        		
        	}
        	super.collectNewChildDescriptors(newChildDescriptors, object);
        }
        
        @SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
        protected Collection getChildrenFeatures(Object object) {
        	if (object instanceof PartitionedContentProvider) {
        		return super.getChildrenFeatures(parent);
        	}
        	return super.getChildrenFeatures(object);
        }
}
        
