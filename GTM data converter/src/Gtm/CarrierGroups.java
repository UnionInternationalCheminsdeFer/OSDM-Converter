/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CarrierGroups#getCarrierGroups <em>Carrier Groups</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarrierGroups()
 * @model
 * @generated
 */
public interface CarrierGroups extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Groups</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.CarrierGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Groups</em>' containment reference list.
	 * @see Gtm.GtmPackage#getCarrierGroups_CarrierGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CarrierGroup> getCarrierGroups();

} // CarrierGroups
