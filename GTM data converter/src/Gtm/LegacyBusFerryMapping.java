/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Bus Ferry Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.LegacyBusFerryMapping#getBusServiceConstraint <em>Bus Service Constraint</em>}</li>
 *   <li>{@link Gtm.LegacyBusFerryMapping#getFerryConstraint <em>Ferry Constraint</em>}</li>
 *   <li>{@link Gtm.LegacyBusFerryMapping#getBusFerryConstraint <em>Bus Ferry Constraint</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacyBusFerryMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MATCHING_TRANSPORT_MODE'"
 * @generated
 */
public interface LegacyBusFerryMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus Service Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Service Constraint</em>' reference.
	 * @see #setBusServiceConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getLegacyBusFerryMapping_BusServiceConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getBusServiceConstraint();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBusFerryMapping#getBusServiceConstraint <em>Bus Service Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Service Constraint</em>' reference.
	 * @see #getBusServiceConstraint()
	 * @generated
	 */
	void setBusServiceConstraint(ServiceConstraint value);

	/**
	 * Returns the value of the '<em><b>Ferry Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ferry Constraint</em>' reference.
	 * @see #setFerryConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getLegacyBusFerryMapping_FerryConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getFerryConstraint();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBusFerryMapping#getFerryConstraint <em>Ferry Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ferry Constraint</em>' reference.
	 * @see #getFerryConstraint()
	 * @generated
	 */
	void setFerryConstraint(ServiceConstraint value);

	/**
	 * Returns the value of the '<em><b>Bus Ferry Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Ferry Constraint</em>' reference.
	 * @see #setBusFerryConstraint(ServiceConstraint)
	 * @see Gtm.GtmPackage#getLegacyBusFerryMapping_BusFerryConstraint()
	 * @model
	 * @generated
	 */
	ServiceConstraint getBusFerryConstraint();

	/**
	 * Sets the value of the '{@link Gtm.LegacyBusFerryMapping#getBusFerryConstraint <em>Bus Ferry Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Ferry Constraint</em>' reference.
	 * @see #getBusFerryConstraint()
	 * @generated
	 */
	void setBusFerryConstraint(ServiceConstraint value);

} // LegacyBusFerryMapping
