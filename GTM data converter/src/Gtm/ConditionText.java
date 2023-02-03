/**
 */
package Gtm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ConditionText#getText <em>Text</em>}</li>
 *   <li>{@link Gtm.ConditionText#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getConditionText()
 * @model
 * @generated
 */
public interface ConditionText extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see Gtm.GtmPackage#getConditionText_Text()
	 * @model required="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link Gtm.ConditionText#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Gtm.ConditionType
	 * @see #setType(ConditionType)
	 * @see Gtm.GtmPackage#getConditionText_Type()
	 * @model required="true"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link Gtm.ConditionText#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Gtm.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

} // ConditionText
