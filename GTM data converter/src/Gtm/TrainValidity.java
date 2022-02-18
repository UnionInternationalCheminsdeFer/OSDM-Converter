/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Validity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.TrainValidity#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.TrainValidity#getSerrviceConstraint <em>Serrvice Constraint</em>}</li>
 *   <li>{@link Gtm.TrainValidity#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getTrainValidity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TRAIN_VALIDITY_REQUIRED_CONTENT'"
 * @generated
 */
public interface TrainValidity extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Gtm.GtmPackage#getTrainValidity_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TrainValidity#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Serrvice Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serrvice Constraint</em>' reference.
	 * @see #setSerrviceConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getTrainValidity_SerrviceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getSerrviceConstraint();

	/**
	 * Sets the value of the '{@link Gtm.TrainValidity#getSerrviceConstraint <em>Serrvice Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serrvice Constraint</em>' reference.
	 * @see #getSerrviceConstraint()
	 * @generated
	 */
	void setSerrviceConstraint(ServiceConstraint value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.BoardingOrArrival}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see Gtm.BoardingOrArrival
	 * @see #setScope(BoardingOrArrival)
	 * @see Gtm.GtmPackage#getTrainValidity_Scope()
	 * @model
	 * @generated
	 */
	BoardingOrArrival getScope();

	/**
	 * Sets the value of the '{@link Gtm.TrainValidity#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see Gtm.BoardingOrArrival
	 * @see #getScope()
	 * @generated
	 */
	void setScope(BoardingOrArrival value);

} // TrainValidity
