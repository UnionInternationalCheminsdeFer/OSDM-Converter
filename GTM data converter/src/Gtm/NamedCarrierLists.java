/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Carrier Lists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.NamedCarrierLists#getNamedCarrierList <em>Named Carrier List</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getNamedCarrierLists()
 * @model
 * @generated
 */
public interface NamedCarrierLists extends EObject {
	/**
	 * Returns the value of the '<em><b>Named Carrier List</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.NamedCarrierList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Carrier List</em>' containment reference list.
	 * @see Gtm.GtmPackage#getNamedCarrierLists_NamedCarrierList()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedCarrierList> getNamedCarrierList();

} // NamedCarrierLists
