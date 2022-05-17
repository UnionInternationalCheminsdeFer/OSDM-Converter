package Gtm.presentation;


import java.util.HashSet;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import Gtm.utils.GtmUtils;

public class SearchControlContribution extends ControlContribution {
	
	Text pattern = null;
	
	static SearchControlContribution me = null;
	
	HashSet<ModifyListener> listeners = new HashSet<ModifyListener>();
	
	public SearchControlContribution(){
		
		super("filter");
		
	}
	
	public static SearchControlContribution getInstance() {
		if (me == null) {
			me = new SearchControlContribution();
		}
		return me;
	}
	
	  
	@Override protected Control createControl(Composite parent){
				
	    Composite composite = new Composite(parent, SWT.NONE);
	    composite.setLayout( new GridLayout( 2, false ) );
	    
		Label filter = new Label(composite, SWT.NONE);
		ImageDescriptor id = GtmUtils.getImageDescriptor("/icons/filter-48.png");
		filter.setImage(id.createImage());
		//search.setText("filter");
		filter.setLayoutData( new GridData( SWT.BEGINNING, SWT.CENTER, false, false ) );
		
		GridData gridData = new GridData( SWT.BEGINNING, SWT.CENTER, false, false );
		gridData.horizontalIndent = 20;    
	    pattern = new Text(composite, SWT.BORDER | SWT.SEARCH);
	    pattern.setTextLimit(20);
	    pattern.setLayoutData(gridData);
	    
	    for (ModifyListener li : listeners){
	    	pattern.addModifyListener(li);
	    }
	    
	    return composite;
	}
	
	public String getPattern() {
		if (pattern != null && !pattern.isDisposed()) {
			return pattern.getText();
		} else {
			return null;
		}
	}

	public void addModifyListener(ModifyListener listener) {
		listeners.add(listener);
		if (pattern != null && !pattern.isDisposed()) {
			pattern.addModifyListener(listener);
		}
	}
	
	public void dispose() {
		listeners.clear();
		me = null;
		pattern = null;
		super.dispose();
	}
	
}
