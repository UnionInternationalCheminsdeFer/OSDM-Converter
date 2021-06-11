package Gtm.presentation;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;

public class GtmPropertySheetPage extends ExtendedPropertySheetPage {

	public GtmPropertySheetPage(AdapterFactoryEditingDomain editingDomain) {
		super(editingDomain);
	}
	
	
	
	public GtmPropertySheetPage(AdapterFactoryEditingDomain editingDomain, Decoration decoration, IDialogSettings dialogSettings, int autoExpandLevel, boolean autoResizeColumns) {
		super(editingDomain, decoration, dialogSettings,autoExpandLevel, autoResizeColumns);
	}

	@Override
	public void handleEntrySelection(ISelection selection) {
		
		super.handleEntrySelection(selection);
		
		//setToolTipSupport();
		
	}

	


	public void setToolTipSupport() {
	    final Tree tree = (Tree)getControl();
	    if (tree == null) return;
	    
	    tree.addMouseTrackListener(new MouseTrackListener() {

			@Override
			public void mouseHover(MouseEvent arg0) {
				
			    for (Control control : tree.getChildren()){
			    	
			    	Listener[] listeners = control.getListeners(SWT.MouseHover);
			    	
			    	for (Listener listener : listeners) {
			    		if (listener instanceof GtmTooltipListener) break;
			    	}
			    	
					control.addMouseTrackListener(new GtmTooltipListener() {
						@Override
						public void mouseEnter(MouseEvent event) {
							// TODO Auto-generated method stub
						}

						@Override
						public void mouseExit(MouseEvent event) {
							// TODO Auto-generated method stub	
						}

						@Override
						public void mouseHover(MouseEvent event) {
							
							Object o = event.data;
							
						}});
					}
			}

			@Override
			public void mouseEnter(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExit(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}



	    });
	}
		    
}
