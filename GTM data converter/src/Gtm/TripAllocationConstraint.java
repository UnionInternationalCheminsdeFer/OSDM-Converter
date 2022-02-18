/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TripAllocationConstraint#getAllocationUnit <em>Allocation Unit</em>}</li>
 *   <li>{@link Gtm.TripAllocationConstraint#getMaxUnits <em>Max Units</em>}</li>
 *   <li>{@link Gtm.TripAllocationConstraint#getDurationUnit <em>Duration Unit</em>}</li>
 *   <li>{@link Gtm.TripAllocationConstraint#getRequiredProcesses <em>Required Processes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTripAllocationConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DURATION_FORMAT'"
 * @generated
 */
public interface TripAllocationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocation Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.TripAllocationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Unit</em>' attribute.
	 * @see Gtm.TripAllocationUnit
	 * @see #setAllocationUnit(TripAllocationUnit)
	 * @see Gtm.GtmPackage#getTripAllocationConstraint_AllocationUnit()
	 * @model
	 * @generated
	 */
	TripAllocationUnit getAllocationUnit();

	/**
	 * Sets the value of the '{@link Gtm.TripAllocationConstraint#getAllocationUnit <em>Allocation Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Unit</em>' attribute.
	 * @see Gtm.TripAllocationUnit
	 * @see #getAllocationUnit()
	 * @generated
	 */
	void setAllocationUnit(TripAllocationUnit value);

	/**
	 * Returns the value of the '<em><b>Max Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Units</em>' attribute.
	 * @see #setMaxUnits(int)
	 * @see Gtm.GtmPackage#getTripAllocationConstraint_MaxUnits()
	 * @model
	 * @generated
	 */
	int getMaxUnits();

	/**
	 * Sets the value of the '{@link Gtm.TripAllocationConstraint#getMaxUnits <em>Max Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Units</em>' attribute.
	 * @see #getMaxUnits()
	 * @generated
	 */
	void setMaxUnits(int value);

	/**
	 * Returns the value of the '<em><b>Duration Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Unit</em>' attribute.
	 * @see #setDurationUnit(String)
	 * @see Gtm.GtmPackage#getTripAllocationConstraint_DurationUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDurationUnit();

	/**
	 * Sets the value of the '{@link Gtm.TripAllocationConstraint#getDurationUnit <em>Duration Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Unit</em>' attribute.
	 * @see #getDurationUnit()
	 * @generated
	 */
	void setDurationUnit(String value);

	/**
	 * Returns the value of the '<em><b>Required Processes</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.TripAllocationProcess}.
	 * The literals are from the enumeration {@link Gtm.TripAllocationProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Processes</em>' attribute list.
	 * @see Gtm.TripAllocationProcess
	 * @see Gtm.GtmPackage#getTripAllocationConstraint_RequiredProcesses()
	 * @model
	 * @generated
	 */
	EList<TripAllocationProcess> getRequiredProcesses();

} // TripAllocationConstraint
