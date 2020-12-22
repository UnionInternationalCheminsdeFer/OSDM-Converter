/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validity Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ValidityRange#getUnit <em>Unit</em>}</li>
 *   <li>{@link Gtm.ValidityRange#getValue <em>Value</em>}</li>
 *   <li>{@link Gtm.ValidityRange#getHoursAfterMidnight <em>Hours After Midnight</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getValidityRange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WARNING_TOO_LONG WARNING_TOO_SHORT'"
 * @generated
 */
public interface ValidityRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see Gtm.GtmPackage#getValidityRange_Unit()
	 * @model
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link Gtm.ValidityRange#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see Gtm.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see Gtm.GtmPackage#getValidityRange_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link Gtm.ValidityRange#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Hours After Midnight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours After Midnight</em>' attribute.
	 * @see #setHoursAfterMidnight(float)
	 * @see Gtm.GtmPackage#getValidityRange_HoursAfterMidnight()
	 * @model
	 * @generated
	 */
	float getHoursAfterMidnight();

	/**
	 * Sets the value of the '{@link Gtm.ValidityRange#getHoursAfterMidnight <em>Hours After Midnight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours After Midnight</em>' attribute.
	 * @see #getHoursAfterMidnight()
	 * @generated
	 */
	void setHoursAfterMidnight(float value);

} // ValidityRange
