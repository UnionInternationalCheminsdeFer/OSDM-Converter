/**
 */
package Gtm.presentation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import Gtm.actions.ConvertGtm2LegacyAction;
import Gtm.actions.ConvertLegacy2GtmAction;
import Gtm.actions.ExportGTMJsonAction;
import Gtm.actions.ExportLegacyAction;
import Gtm.actions.GtmDeleteFolderAction;
import Gtm.actions.GtmValidateAction;
import Gtm.actions.ImportBorderPointsAction;
import Gtm.actions.ImportCarriersAction;
import Gtm.actions.ImportGTMJsonAction;
import Gtm.actions.ImportLegacy108Action;
import Gtm.actions.ImportNutsCodesAction;
import Gtm.actions.ImportServiceBrandsAction;
import Gtm.actions.ImportStationsAction;


/**
 * This is the action bar contributor for the Gtm model editor.
 * <!-- begin-user-doc -->
 * implements IEditingDomainProvider
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class GtmActionBarContributor
	extends EditingDomainActionBarContributor
	implements ISelectionChangedListener , IEditingDomainProvider {
	/**
	 * Action to create objects from the Gtm model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class NewAction extends WorkbenchWindowActionDelegate {
		/**
		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void run(IAction action) {
			GtmModelWizard wizard = new GtmModelWizard();
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.open();
		}
	}

	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(GtmEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet");
				}
				catch (PartInitException exception) {
					GtmEditorPlugin.INSTANCE.log(exception);
				}
			}
		};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction =
		new Action(GtmEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
			@Override
			public boolean isEnabled() {
				return activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	
	/**
	 * This will contain all additional actions which need a selection update
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected static Collection<BaseSelectionListenerAction> gtmActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IMenuManager gtmMenuManager;
	
	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	protected ImportStationsAction importStationsAction = null;
	protected ImportCarriersAction importCarriersAction = null;
	protected ImportServiceBrandsAction importServiceBrandsAction = null;
	protected ImportNutsCodesAction importNutsCodesAction = null;	
	protected ImportBorderPointsAction importBorderPointsAction = null;	
	protected ImportLegacy108Action importLegacy108Action = null;				
	protected ImportGTMJsonAction importGTMJsonAction = null;	
	protected ExportGTMJsonAction exportGTMJsonAction = null;	
	protected ExportLegacyAction exportLegacyAction = null;	
	protected ConvertLegacy2GtmAction convertLegacy2GtmAction = null;
	protected ConvertGtm2LegacyAction convertGtm2LegacyAction = null;
	
	protected SearchControlContribution filter = SearchControlContribution.getInstance();
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GtmActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
		validateAction = new GtmValidateAction();
		controlAction = new ControlAction();
		deleteAction = new GtmDeleteFolderAction();
		
		if (deleteAction == null) {
			deleteAction = new GtmDeleteFolderAction();
		} 
		if (cutAction == null) {
			cutAction = new CutAction();
		}
		if (copyAction == null) {
			copyAction = new CopyAction();
		}
		if (pasteAction == null) {
			pasteAction = new PasteAction();
		}
		if (undoAction == null) {
			undoAction = new UndoAction();
		}
		if (redoAction == null) {
			redoAction = new RedoAction();
		}
		
		extendActionBarContributor();
		
	}
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void extendActionBarContributor() {
		
		if (importStationsAction == null) {
			importStationsAction = new ImportStationsAction(this);
		}
		if (importCarriersAction == null) {
			importCarriersAction = new ImportCarriersAction(this);
		}
		if (importServiceBrandsAction == null ) {
			importServiceBrandsAction = new ImportServiceBrandsAction(this);
		}
		if (importNutsCodesAction == null) {
			importNutsCodesAction = new ImportNutsCodesAction(this);
		}
		if (importBorderPointsAction == null) {
			importBorderPointsAction = new ImportBorderPointsAction(this);
		}
		if (importLegacy108Action == null) {
			importLegacy108Action = new ImportLegacy108Action(this);
		}
		if (convertLegacy2GtmAction == null) {
			convertLegacy2GtmAction = new ConvertLegacy2GtmAction(this);
		}
		if (exportGTMJsonAction == null) {
			exportGTMJsonAction = new ExportGTMJsonAction(this);	
		}
		if (importGTMJsonAction == null) {		
			importGTMJsonAction = new ImportGTMJsonAction(this);
		}
		if (convertGtm2LegacyAction == null) {			
			convertGtm2LegacyAction = new ConvertGtm2LegacyAction(this);
		}
		if (exportLegacyAction == null) {			
			exportLegacyAction = new ExportLegacyAction(this);
		}
		
		if (deleteAction == null) {
			deleteAction = new GtmDeleteFolderAction();
		}
		
		if (gtmActions == null) {
			gtmActions = new ArrayList<BaseSelectionListenerAction>();
		}
		if (gtmActions.isEmpty()) {
			gtmActions.add(importStationsAction);
			gtmActions.add(importCarriersAction);
			gtmActions.add(importServiceBrandsAction);
			gtmActions.add(importNutsCodesAction);	
			gtmActions.add(importBorderPointsAction);	
			gtmActions.add(importLegacy108Action);	
			gtmActions.add(convertLegacy2GtmAction);	
			gtmActions.add(exportGTMJsonAction);				
			gtmActions.add(importGTMJsonAction);	
			gtmActions.add(convertGtm2LegacyAction);
			gtmActions.add(exportLegacyAction);	
		}

		
	}
	
	
	/**
	  * Returns the action used to implement delete.
	  * @see #deleteAction
	  * @since 2.6
	  * @generated NOT
	  * 
	  */
	protected DeleteAction createDeleteAction()
	{
	    return new GtmDeleteFolderAction(removeAllReferencesOnDelete());
	}


	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		contributeToToolBarGen(toolBarManager);
		
		if (toolBarManager == null) return;
		
		if (importBorderPointsAction == null) {
			extendActionBarContributor();
			toolBarManager.add(new Separator("gtm-settings"));
			toolBarManager.add(new Separator("gtm-additions"));
		}
		toolBarManager.insertAfter("gtm-additions",importBorderPointsAction);
		toolBarManager.insertAfter("gtm-additions",importNutsCodesAction);
		toolBarManager.insertAfter("gtm-additions",importServiceBrandsAction);
		toolBarManager.insertAfter("gtm-additions",importCarriersAction);
		toolBarManager.insertAfter("gtm-additions",importStationsAction);

		
		toolBarManager.add(new Separator("gtm-convert-l-2-g"));

		toolBarManager.insertAfter("gtm-convert-l-2-g",exportGTMJsonAction);	
		toolBarManager.insertAfter("gtm-convert-l-2-g",convertLegacy2GtmAction);
		toolBarManager.insertAfter("gtm-convert-l-2-g",importLegacy108Action);	
		
		toolBarManager.add(new Separator("gtm-convert-g-2-l"));
		
		toolBarManager.insertAfter("gtm-convert-g-2-l",exportLegacyAction);	
		toolBarManager.insertAfter("gtm-convert-g-2-l",convertGtm2LegacyAction);
		toolBarManager.insertAfter("gtm-convert-g-2-l",importGTMJsonAction);	
		
		toolBarManager.add(new Separator("filter"));
		toolBarManager.insertAfter("filter",filter);

	}
	
	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void contributeToToolBarGen(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
		toolBarManager.add(new Separator("gtm-settings"));
		toolBarManager.add(new Separator("gtm-additions"));
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_GtmEditor_menu"), "GtmMenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);
		
		// Prepare for gtm actions.
		gtmMenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_GTM_menu_item"));
		submenuManager.insertBefore("additions", gtmMenuManager);


		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}
	

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
    */
	@Override
	public void setActiveEditor(IEditorPart part) {
		
		super.setActiveEditor(part);
	
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null || part.getSite() == null) {
			selectionProvider = null;
			
		} else {
			
			selectionProvider = part.getSite().getSelectionProvider();
			
			if (selectionProvider != null) {
				selectionProvider.addSelectionChangedListener(this);
			
				// Fake a selection changed event to update the menus.
				//
				if (selectionProvider.getSelection() != null) {
					selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
				}
			}
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
	 * that can be added to the selected object and updating the menus accordingly.
	 * <!-- begin-user-doc -->
	 * additional actions included
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}
		/*
		if (gtmMenuManager != null) {
			depopulateManager(gtmMenuManager, gtmActions);
		}	
		*/	

		// Query the new selection for appropriate new child/sibling descriptors and generate actions
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;
		
		ISelection selection = event.getSelection();

		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1) {
			Object object = ((IStructuredSelection)selection).getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();

			if (object instanceof VirtualFolderItemProvider) {
				if (copyAction != null) {
					copyAction.setEnabled(false);
				}			
				VirtualFolderItemProvider pcp = (VirtualFolderItemProvider) object;
				newChildDescriptors = domain.getNewChildDescriptors(pcp.getParent(object), null);
				createChildActions = generateCreateChildActions(newChildDescriptors, new StructuredSelection(pcp.getParent(object)));	
				newSiblingDescriptors = domain.getNewChildDescriptors(null,pcp.getParent(object));
				createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, new StructuredSelection(pcp.getParent(object)));	
				for (IAction a : createSiblingActions) {
					a.setEnabled(false);
				}
			
			} else {
				if (copyAction != null) {
					copyAction.setEnabled(true);
				}
				newChildDescriptors = domain.getNewChildDescriptors(object, null);
				createChildActions = generateCreateChildActions(newChildDescriptors, selection);
				newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
				createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);
			}
		}

		// Generate actions for selection; populate and redraw the menus.

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions, null);
			createSiblingMenuManager.update(true);
		}
		
		deleteAction.updateSelection((IStructuredSelection) selection);
				//additional actions
		/*
		for (BaseSelectionListenerAction action : gtmActions) {
			action.selectionChanged(event);			
		}
		if (gtmMenuManager != null) {
			populateManager(gtmMenuManager, gtmActions, null);
			gtmMenuManager.update(true);
		}
		*/

	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
		
	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		submenuManager = new MenuManager(GtmEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager);
				
	}

	/**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
	 * additional actions added
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction);
		
		
		//additional actions
		for (BaseSelectionListenerAction action : gtmActions) {
			action.setEnabled(action.isEnabled());		
			menuManager.insertAfter("ui-actions",action);
		}

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EditingDomain getEditingDomain() {
		return ((GtmEditor)activeEditor).getEditingDomain();
		//return ((IEditingDomainProvider)activeEditorPart).getEditingDomain();
	}
	
	/*
	 * This provides the active editor
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IEditorPart getActiveEditor() {
		return activeEditor;
	}
}
