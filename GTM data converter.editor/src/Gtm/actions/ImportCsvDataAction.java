package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.nls.NationalLanguageSupport;



public abstract class ImportCsvDataAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		

		public ImportCsvDataAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
		}
		

		
	    public boolean updateSelection (IStructuredSelection selection)
	    {
	  		this.setEnabled(false);

	  		if (checkSelection(selection)) 	{
	  			this.setEnabled(true);
	  			return true;
	  		}
	  		return false;
	    }	
	    
		protected BufferedReader getReader(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.csv" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportCsvDataAction_1);
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return br;

			
		}
		
		protected BufferedReader getReader(String text, String charsetName){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.csv" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charsetName));
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportCsvDataAction_1);
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} catch (UnsupportedEncodingException e) {
				try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText(NationalLanguageSupport.ImportCsvDataAction_1);
					dialog.setMessage(e.getMessage());
					dialog.open(); 
					e.printStackTrace();
					return null;
				}
			} 
	        
	        return br;

			
		}
		
		/**
		 * Split csv.
		 *
		 * @param string the string
		 * @return the string[] splitted by ; or ,
		 */
		public static String[] splitCsv(String string) {
		
			String[] st1 = string.split(";"); //$NON-NLS-1$
			String[] st2 = string.split(","); //$NON-NLS-1$
			
			if (st1.length < st2.length) {
				return st2;
			}
			
			return 	st1;
		}
		
		

	

}
