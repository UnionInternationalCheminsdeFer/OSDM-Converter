/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Carrier Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.AddCarrierRules#getAddCarrierRule <em>Add Carrier Rule</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getAddCarrierRules()
 * @model
 * @generated
 */
public interface AddCarrierRules extends EObject {
	/**
	 * Returns the value of the '<em><b>Add Carrier Rule</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.AddCarrierRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Carrier Rule</em>' containment reference list.
	 * @see Gtm.GtmPackage#getAddCarrierRules_AddCarrierRule()
	 * @model containment="true"
	 * @generated
	 */
	EList<AddCarrierRule> getAddCarrierRule();

} // AddCarrierRules
