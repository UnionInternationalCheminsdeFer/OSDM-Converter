package Gtm.actions;

import java.util.Collection;
import java.util.Iterator;


import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import Gtm.GTMTool;
import Gtm.nls.NationalLanguageSupport;
import Gtm.presentation.VirtualFolderItemProvider;
import Gtm.utils.GtmUtils;




public class GtmDeleteFolderAction extends DeleteAction implements ISelectionChangedListener {
	
	private Collection<?> folderSelection = null;
	
	public GtmDeleteFolderAction() {
		  super();
    }
	
	public GtmDeleteFolderAction(boolean removeAllReferencesOnDelete) {
		super(removeAllReferencesOnDelete);
	}

	public void run() {
		
		if (checkFolderSelection(folderSelection)) {
			runFolderDelete(folderSelection);
		} else {
			super.run();
		}
		return;
	}
	
	@Override
	public Command createCommand(Collection<?> selection) {
		 
	  		if (checkFolderSelection(selection)) 	{
	  			return createFolderDeleteCommand(selection);
	  		} else {
	  			return super.createCommand(selection);
	  		}
		 
	 }
	
    public boolean updateSelection (IStructuredSelection selection)   {
    	
  		setEnabled(false);

  		if (checkFolderSelection(selection.toList())) 	{
  			setEnabled(true);
  			folderSelection = selection.toList();	
  			return true;
  		} else {
  			folderSelection = null;
  		   	setEnabled(super.updateSelection(selection));
  			return super.isEnabled();
  		}
    }	
	
	protected boolean checkFolderSelection(Collection<?> selection)	{
				
			if (GtmUtils.getGtmTool() == null) return false;
			
			if (selection == null || selection.isEmpty()) return false;
						
			Iterator<?> it = selection.iterator();
			
			while (it.hasNext()) {
				
				if (!(it.next() instanceof VirtualFolderItemProvider)) {
					return false;
				}
			}
 			
			return true;
		}
		  
	
	protected CompoundCommand createFolderDeleteCommand(Collection<?> selection) {

		GTMTool tool = GtmUtils.getGtmTool();
				
		EditingDomain domain = GtmUtils.getActiveDomain();
				
		if (tool == null) {
			GtmUtils.writeConsoleWarning(NationalLanguageSupport.BasicGtmAction_0,GtmUtils.getActiveEditor());
			return null;
		}
				
		Iterator<?> it = selection.iterator();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		while (it.hasNext()) {
			Object nextObject = it.next();
			if (nextObject instanceof VirtualFolderItemProvider) {
				Command com = DeleteCommand.create(domain, ((VirtualFolderItemProvider)nextObject).getFolderContent());
				compoundCommand.append(com);
			}
		}
		
		return compoundCommand;
		


	  }

	  
	protected void runFolderDelete(Collection<?> structuredSelection) {
		
		CompoundCommand compoundCommand =  createFolderDeleteCommand(structuredSelection);
		
		if (compoundCommand != null && !compoundCommand.isEmpty() && compoundCommand.canExecute()) {
			domain.getCommandStack().execute(compoundCommand);
		}

	  }

}
