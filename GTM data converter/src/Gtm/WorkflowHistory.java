/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.WorkflowHistory#getWorkflowSteps <em>Workflow Steps</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getWorkflowHistory()
 * @model
 * @generated
 */
public interface WorkflowHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflow Steps</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.WorkflowStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Steps</em>' containment reference list.
	 * @see Gtm.GtmPackage#getWorkflowHistory_WorkflowSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowStep> getWorkflowSteps();

} // WorkflowHistory
