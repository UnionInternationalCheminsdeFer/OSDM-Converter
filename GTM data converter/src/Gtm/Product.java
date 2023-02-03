/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Product#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.Product#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.Product#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.Product#getSummary <em>Summary</em>}</li>
 *   <li>{@link Gtm.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.Product#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link Gtm.Product#getServiceConstraintText <em>Service Constraint Text</em>}</li>
 *   <li>{@link Gtm.Product#getCarrierConstraintText <em>Carrier Constraint Text</em>}</li>
 *   <li>{@link Gtm.Product#getConditionTexts <em>Condition Texts</em>}</li>
 *   <li>{@link Gtm.Product#getReturnProduct <em>Return Product</em>}</li>
 *   <li>{@link Gtm.Product#getTrainBound <em>Train Bound</em>}</li>
 *   <li>{@link Gtm.Product#getRefundableAfterValidity <em>Refundable After Validity</em>}</li>
 *   <li>{@link Gtm.Product#getRefundableBeforeValidity <em>Refundable Before Validity</em>}</li>
 *   <li>{@link Gtm.Product#getExchangeableAfterValidity <em>Exchangeable After Validity</em>}</li>
 *   <li>{@link Gtm.Product#getExchangeableBeforeValidity <em>Exchangeable Before Validity</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getProduct_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.Product#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Gtm.GtmPackage#getProduct_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Gtm.Product#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Text)
	 * @see Gtm.GtmPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	Text getName();

	/**
	 * Sets the value of the '{@link Gtm.Product#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Text value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' reference.
	 * @see #setSummary(Text)
	 * @see Gtm.GtmPackage#getProduct_Summary()
	 * @model
	 * @generated
	 */
	Text getSummary();

	/**
	 * Sets the value of the '{@link Gtm.Product#getSummary <em>Summary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(Text value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Text)
	 * @see Gtm.GtmPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	Text getDescription();

	/**
	 * Sets the value of the '{@link Gtm.Product#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Travel Class</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.ClassicClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Class</em>' attribute.
	 * @see Gtm.ClassicClassType
	 * @see #setTravelClass(ClassicClassType)
	 * @see Gtm.GtmPackage#getProduct_TravelClass()
	 * @model
	 * @generated
	 */
	ClassicClassType getTravelClass();

	/**
	 * Sets the value of the '{@link Gtm.Product#getTravelClass <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Class</em>' attribute.
	 * @see Gtm.ClassicClassType
	 * @see #getTravelClass()
	 * @generated
	 */
	void setTravelClass(ClassicClassType value);

	/**
	 * Returns the value of the '<em><b>Service Constraint Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Constraint Text</em>' reference.
	 * @see #setServiceConstraintText(Text)
	 * @see Gtm.GtmPackage#getProduct_ServiceConstraintText()
	 * @model
	 * @generated
	 */
	Text getServiceConstraintText();

	/**
	 * Sets the value of the '{@link Gtm.Product#getServiceConstraintText <em>Service Constraint Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Constraint Text</em>' reference.
	 * @see #getServiceConstraintText()
	 * @generated
	 */
	void setServiceConstraintText(Text value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint Text</em>' reference.
	 * @see #setCarrierConstraintText(Text)
	 * @see Gtm.GtmPackage#getProduct_CarrierConstraintText()
	 * @model
	 * @generated
	 */
	Text getCarrierConstraintText();

	/**
	 * Sets the value of the '{@link Gtm.Product#getCarrierConstraintText <em>Carrier Constraint Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint Text</em>' reference.
	 * @see #getCarrierConstraintText()
	 * @generated
	 */
	void setCarrierConstraintText(Text value);

	/**
	 * Returns the value of the '<em><b>Condition Texts</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ConditionText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Texts</em>' containment reference list.
	 * @see Gtm.GtmPackage#getProduct_ConditionTexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionText> getConditionTexts();

	/**
	 * Returns the value of the '<em><b>Return Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Product</em>' attribute.
	 * @see #setReturnProduct(Boolean)
	 * @see Gtm.GtmPackage#getProduct_ReturnProduct()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getReturnProduct();

	/**
	 * Sets the value of the '{@link Gtm.Product#getReturnProduct <em>Return Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Product</em>' attribute.
	 * @see #getReturnProduct()
	 * @generated
	 */
	void setReturnProduct(Boolean value);

	/**
	 * Returns the value of the '<em><b>Train Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Bound</em>' attribute.
	 * @see #setTrainBound(Boolean)
	 * @see Gtm.GtmPackage#getProduct_TrainBound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getTrainBound();

	/**
	 * Sets the value of the '{@link Gtm.Product#getTrainBound <em>Train Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Bound</em>' attribute.
	 * @see #getTrainBound()
	 * @generated
	 */
	void setTrainBound(Boolean value);

	/**
	 * Returns the value of the '<em><b>Refundable After Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refundable After Validity</em>' attribute.
	 * @see #setRefundableAfterValidity(Boolean)
	 * @see Gtm.GtmPackage#getProduct_RefundableAfterValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getRefundableAfterValidity();

	/**
	 * Sets the value of the '{@link Gtm.Product#getRefundableAfterValidity <em>Refundable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refundable After Validity</em>' attribute.
	 * @see #getRefundableAfterValidity()
	 * @generated
	 */
	void setRefundableAfterValidity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Refundable Before Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refundable Before Validity</em>' attribute.
	 * @see #setRefundableBeforeValidity(Boolean)
	 * @see Gtm.GtmPackage#getProduct_RefundableBeforeValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getRefundableBeforeValidity();

	/**
	 * Sets the value of the '{@link Gtm.Product#getRefundableBeforeValidity <em>Refundable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refundable Before Validity</em>' attribute.
	 * @see #getRefundableBeforeValidity()
	 * @generated
	 */
	void setRefundableBeforeValidity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exchangeable After Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchangeable After Validity</em>' attribute.
	 * @see #setExchangeableAfterValidity(Boolean)
	 * @see Gtm.GtmPackage#getProduct_ExchangeableAfterValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getExchangeableAfterValidity();

	/**
	 * Sets the value of the '{@link Gtm.Product#getExchangeableAfterValidity <em>Exchangeable After Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchangeable After Validity</em>' attribute.
	 * @see #getExchangeableAfterValidity()
	 * @generated
	 */
	void setExchangeableAfterValidity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Exchangeable Before Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchangeable Before Validity</em>' attribute.
	 * @see #setExchangeableBeforeValidity(Boolean)
	 * @see Gtm.GtmPackage#getProduct_ExchangeableBeforeValidity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 * @generated
	 */
	Boolean getExchangeableBeforeValidity();

	/**
	 * Sets the value of the '{@link Gtm.Product#getExchangeableBeforeValidity <em>Exchangeable Before Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchangeable Before Validity</em>' attribute.
	 * @see #getExchangeableBeforeValidity()
	 * @generated
	 */
	void setExchangeableBeforeValidity(Boolean value);

} // Product
