/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Carrier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.NamedCarrierList#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.NamedCarrierList#getCarriers <em>Carriers</em>}</li>
 *   <li>{@link Gtm.NamedCarrierList#getReplacementCode <em>Replacement Code</em>}</li>
 *   <li>{@link Gtm.NamedCarrierList#getCarrierGroup <em>Carrier Group</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getNamedCarrierList()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NOT_EMPTY'"
 * @generated
 */
public interface NamedCarrierList extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getNamedCarrierList_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.NamedCarrierList#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Carriers</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriers</em>' reference list.
	 * @see Gtm.GtmPackage#getNamedCarrierList_Carriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getCarriers();

	/**
	 * Returns the value of the '<em><b>Replacement Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Code</em>' attribute.
	 * @see #setReplacementCode(String)
	 * @see Gtm.GtmPackage#getNamedCarrierList_ReplacementCode()
	 * @model
	 * @generated
	 */
	String getReplacementCode();

	/**
	 * Sets the value of the '{@link Gtm.NamedCarrierList#getReplacementCode <em>Replacement Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Code</em>' attribute.
	 * @see #getReplacementCode()
	 * @generated
	 */
	void setReplacementCode(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Group</em>' reference.
	 * @see #setCarrierGroup(CarrierGroup)
	 * @see Gtm.GtmPackage#getNamedCarrierList_CarrierGroup()
	 * @model
	 * @generated
	 */
	CarrierGroup getCarrierGroup();

	/**
	 * Sets the value of the '{@link Gtm.NamedCarrierList#getCarrierGroup <em>Carrier Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Group</em>' reference.
	 * @see #getCarrierGroup()
	 * @generated
	 */
	void setCarrierGroup(CarrierGroup value);

} // NamedCarrierList
