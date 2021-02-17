/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Total Passenger Combination Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TotalPassengerCombinationConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.TotalPassengerCombinationConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}</li>
 *   <li>{@link Gtm.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTotalPassengerCombinationConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MIN_MAX_MUST NOT_REFERENCED'"
 * @generated
 */
public interface TotalPassengerCombinationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getTotalPassengerCombinationConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.TotalPassengerCombinationConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getTotalPassengerCombinationConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.TotalPassengerCombinationConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Max Total Passenger Weight</b></em>' attribute.
	 * The default value is <code>"999"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Total Passenger Weight</em>' attribute.
	 * @see #setMaxTotalPassengerWeight(float)
	 * @see Gtm.GtmPackage#getTotalPassengerCombinationConstraint_MaxTotalPassengerWeight()
	 * @model default="999"
	 * @generated
	 */
	float getMaxTotalPassengerWeight();

	/**
	 * Sets the value of the '{@link Gtm.TotalPassengerCombinationConstraint#getMaxTotalPassengerWeight <em>Max Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total Passenger Weight</em>' attribute.
	 * @see #getMaxTotalPassengerWeight()
	 * @generated
	 */
	void setMaxTotalPassengerWeight(float value);

	/**
	 * Returns the value of the '<em><b>Min Total Passenger Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Total Passenger Weight</em>' attribute.
	 * @see #setMinTotalPassengerWeight(float)
	 * @see Gtm.GtmPackage#getTotalPassengerCombinationConstraint_MinTotalPassengerWeight()
	 * @model default="0"
	 * @generated
	 */
	float getMinTotalPassengerWeight();

	/**
	 * Sets the value of the '{@link Gtm.TotalPassengerCombinationConstraint#getMinTotalPassengerWeight <em>Min Total Passenger Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Total Passenger Weight</em>' attribute.
	 * @see #getMinTotalPassengerWeight()
	 * @generated
	 */
	void setMinTotalPassengerWeight(float value);

} // TotalPassengerCombinationConstraint
