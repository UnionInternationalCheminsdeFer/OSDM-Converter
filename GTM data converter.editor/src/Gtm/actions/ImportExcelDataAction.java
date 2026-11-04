package Gtm.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import Gtm.nls.NationalLanguageSupport;



public abstract class ImportExcelDataAction extends BasicGtmAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		

		public ImportExcelDataAction(String text, IEditingDomainProvider editingDomainProvider) {
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
	    
		private FileInputStream getReader(String text){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.xslx" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        File file = new File(path);
	        
	        FileInputStream fs;
			try {
				fs = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportCsvDataAction_1);
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			} 
	        
	        return fs;

			
		}
		
		protected Workbook getWorkbook(String text) {

			FileInputStream fs = this.getReader(text);

			Workbook workbook = null;
			try {
				workbook = new XSSFWorkbook(fs);
			} catch (IOException e) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Importing Excel File failed");
				dialog.setMessage(e.getMessage());
				dialog.open(); 
				e.printStackTrace();
				return null;
			}
			
			return workbook;
			
		}
		
		protected BufferedReader getReader(String text, String charsetName){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(text);
	        String[] filterExt = { "*.xslx" }; //$NON-NLS-1$
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
