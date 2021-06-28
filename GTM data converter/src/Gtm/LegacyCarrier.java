/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Carrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyCarrier#getCarrierCode <em>Carrier Code</em>}</li>
 *   <li>{@link Gtm.LegacyCarrier#getCarrierShortName <em>Carrier Short Name</em>}</li>
 *   <li>{@link Gtm.LegacyCarrier#getCarrierName <em>Carrier Name</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyCarrier()
 * @model
 * @generated
 */
public interface LegacyCarrier extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Code</em>' attribute.
	 * @see #setCarrierCode(String)
	 * @see Gtm.GtmPackage#getLegacyCarrier_CarrierCode()
	 * @model
	 * @generated
	 */
	String getCarrierCode();

	/**
	 * Sets the value of the '{@link Gtm.LegacyCarrier#getCarrierCode <em>Carrier Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Code</em>' attribute.
	 * @see #getCarrierCode()
	 * @generated
	 */
	void setCarrierCode(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Short Name</em>' attribute.
	 * @see #setCarrierShortName(String)
	 * @see Gtm.GtmPackage#getLegacyCarrier_CarrierShortName()
	 * @model
	 * @generated
	 */
	String getCarrierShortName();

	/**
	 * Sets the value of the '{@link Gtm.LegacyCarrier#getCarrierShortName <em>Carrier Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Short Name</em>' attribute.
	 * @see #getCarrierShortName()
	 * @generated
	 */
	void setCarrierShortName(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Name</em>' attribute.
	 * @see #setCarrierName(String)
	 * @see Gtm.GtmPackage#getLegacyCarrier_CarrierName()
	 * @model
	 * @generated
	 */
	String getCarrierName();

	/**
	 * Sets the value of the '{@link Gtm.LegacyCarrier#getCarrierName <em>Carrier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Name</em>' attribute.
	 * @see #getCarrierName()
	 * @generated
	 */
	void setCarrierName(String value);

} // LegacyCarrier
