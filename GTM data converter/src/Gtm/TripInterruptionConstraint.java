/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip Interruption Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TripInterruptionConstraint#getMaxInterruptions <em>Max Interruptions</em>}</li>
 *   <li>{@link Gtm.TripInterruptionConstraint#getMaxDuration <em>Max Duration</em>}</li>
 *   <li>{@link Gtm.TripInterruptionConstraint#getTotalMaxDuration <em>Total Max Duration</em>}</li>
 *   <li>{@link Gtm.TripInterruptionConstraint#getRequiredProcesses <em>Required Processes</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTripInterruptionConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DURATION_FORMAT'"
 * @generated
 */
public interface TripInterruptionConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Interruptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interruptions</em>' attribute.
	 * @see #setMaxInterruptions(int)
	 * @see Gtm.GtmPackage#getTripInterruptionConstraint_MaxInterruptions()
	 * @model
	 * @generated
	 */
	int getMaxInterruptions();

	/**
	 * Sets the value of the '{@link Gtm.TripInterruptionConstraint#getMaxInterruptions <em>Max Interruptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interruptions</em>' attribute.
	 * @see #getMaxInterruptions()
	 * @generated
	 */
	void setMaxInterruptions(int value);

	/**
	 * Returns the value of the '<em><b>Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Duration</em>' attribute.
	 * @see #setMaxDuration(String)
	 * @see Gtm.GtmPackage#getTripInterruptionConstraint_MaxDuration()
	 * @model
	 * @generated
	 */
	String getMaxDuration();

	/**
	 * Sets the value of the '{@link Gtm.TripInterruptionConstraint#getMaxDuration <em>Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Duration</em>' attribute.
	 * @see #getMaxDuration()
	 * @generated
	 */
	void setMaxDuration(String value);

	/**
	 * Returns the value of the '<em><b>Total Max Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Max Duration</em>' attribute.
	 * @see #setTotalMaxDuration(String)
	 * @see Gtm.GtmPackage#getTripInterruptionConstraint_TotalMaxDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTotalMaxDuration();

	/**
	 * Sets the value of the '{@link Gtm.TripInterruptionConstraint#getTotalMaxDuration <em>Total Max Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Max Duration</em>' attribute.
	 * @see #getTotalMaxDuration()
	 * @generated
	 */
	void setTotalMaxDuration(String value);

	/**
	 * Returns the value of the '<em><b>Required Processes</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.TripInterruptionProcess}.
	 * The literals are from the enumeration {@link Gtm.TripInterruptionProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Processes</em>' attribute list.
	 * @see Gtm.TripInterruptionProcess
	 * @see Gtm.GtmPackage#getTripInterruptionConstraint_RequiredProcesses()
	 * @model
	 * @generated
	 */
	EList<TripInterruptionProcess> getRequiredProcesses();

} // TripInterruptionConstraint
