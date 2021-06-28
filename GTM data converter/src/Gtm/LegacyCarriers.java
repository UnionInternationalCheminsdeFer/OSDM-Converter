/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Carriers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyCarriers#getLegacyCarrier <em>Legacy Carrier</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyCarriers()
 * @model
 * @generated
 */
public interface LegacyCarriers extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Carrier</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.LegacyCarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Carrier</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacyCarriers_LegacyCarrier()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegacyCarrier> getLegacyCarrier();

} // LegacyCarriers
