/**
 */
package Gtm.impl;

import Gtm.GtmPackage;
import Gtm.WorkflowHistory;
import Gtm.WorkflowStep;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gtm.impl.WorkflowHistoryImpl#getWorkflowSteps <em>Workflow Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowHistoryImpl extends MinimalEObjectImpl.Container implements WorkflowHistory {
	/**
	 * The cached value of the '{@link #getWorkflowSteps() <em>Workflow Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowStep> workflowSteps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtmPackage.Literals.WORKFLOW_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkflowStep> getWorkflowSteps() {
		if (workflowSteps == null) {
			workflowSteps = new EObjectResolvingEList<WorkflowStep>(WorkflowStep.class, this, GtmPackage.WORKFLOW_HISTORY__WORKFLOW_STEPS);
		}
		return workflowSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GtmPackage.WORKFLOW_HISTORY__WORKFLOW_STEPS:
				return getWorkflowSteps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GtmPackage.WORKFLOW_HISTORY__WORKFLOW_STEPS:
				getWorkflowSteps().clear();
				getWorkflowSteps().addAll((Collection<? extends WorkflowStep>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GtmPackage.WORKFLOW_HISTORY__WORKFLOW_STEPS:
				getWorkflowSteps().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GtmPackage.WORKFLOW_HISTORY__WORKFLOW_STEPS:
				return workflowSteps != null && !workflowSteps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowHistoryImpl
