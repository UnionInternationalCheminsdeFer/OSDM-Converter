/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FulfillmentConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getAcceptedFulfilmentTypes <em>Accepted Fulfilment Types</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getRequiredControlDataExchange <em>Required Control Data Exchange</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getAcceptedBarcodeTypes <em>Accepted Barcode Types</em>}</li>
 *   <li>{@link Gtm.FulfillmentConstraint#getRequiredBarcodeTypes <em>Required Barcode Types</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFulfillmentConstraint()
 * @model features="requiredBarcodes" 
 *        requiredBarcodesType="Gtm.RequiredBarcodes" requiredBarcodesContainment="true" requiredBarcodesSuppressedGetVisibility="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_ACCEPTED_TYPE'"
 * @generated
 */
public interface FulfillmentConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.FulfillmentConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Fulfilment Types</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.FulfillmentType}.
	 * The literals are from the enumeration {@link Gtm.FulfillmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Fulfilment Types</em>' attribute list.
	 * @see Gtm.FulfillmentType
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_AcceptedFulfilmentTypes()
	 * @model
	 * @generated
	 */
	EList<FulfillmentType> getAcceptedFulfilmentTypes();

	/**
	 * Returns the value of the '<em><b>Required Control Data Exchange</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.ControlDataExchangeTypes}.
	 * The literals are from the enumeration {@link Gtm.ControlDataExchangeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Control Data Exchange</em>' attribute list.
	 * @see Gtm.ControlDataExchangeTypes
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_RequiredControlDataExchange()
	 * @model
	 * @generated
	 */
	EList<ControlDataExchangeTypes> getRequiredControlDataExchange();

	/**
	 * Returns the value of the '<em><b>Individual Ticketing Permitted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Ticketing Permitted</em>' attribute.
	 * @see #setIndividualTicketingPermitted(boolean)
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_IndividualTicketingPermitted()
	 * @model default="false"
	 * @generated
	 */
	boolean isIndividualTicketingPermitted();

	/**
	 * Sets the value of the '{@link Gtm.FulfillmentConstraint#isIndividualTicketingPermitted <em>Individual Ticketing Permitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Ticketing Permitted</em>' attribute.
	 * @see #isIndividualTicketingPermitted()
	 * @generated
	 */
	void setIndividualTicketingPermitted(boolean value);

	/**
	 * Returns the value of the '<em><b>Accepted Barcodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcodes</em>' containment reference.
	 * @see #setAcceptedBarcodes(AcceptedBarcodes)
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_AcceptedBarcodes()
	 * @model containment="true"
	 * @generated
	 */
	AcceptedBarcodes getAcceptedBarcodes();

	/**
	 * Sets the value of the '{@link Gtm.FulfillmentConstraint#getAcceptedBarcodes <em>Accepted Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted Barcodes</em>' containment reference.
	 * @see #getAcceptedBarcodes()
	 * @generated
	 */
	void setAcceptedBarcodes(AcceptedBarcodes value);

	/**
	 * Sets the value of the '{@link Gtm.FulfillmentConstraint#getRequiredBarcodes <em>Required Barcodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Barcodes</em>' containment reference.
	 * @see #getRequiredBarcodes()
	 * @generated
	 */
	void setRequiredBarcodes(RequiredBarcodes value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.FulfillmentConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Accepted Barcode Types</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.BarcodeTypes}.
	 * The literals are from the enumeration {@link Gtm.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Barcode Types</em>' attribute list.
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_AcceptedBarcodeTypes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getAcceptedBarcodeTypes();

	/**
	 * Returns the value of the '<em><b>Required Barcode Types</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.BarcodeTypes}.
	 * The literals are from the enumeration {@link Gtm.BarcodeTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Barcode Types</em>' attribute list.
	 * @see Gtm.BarcodeTypes
	 * @see Gtm.GtmPackage#getFulfillmentConstraint_RequiredBarcodeTypes()
	 * @model
	 * @generated
	 */
	EList<BarcodeTypes> getRequiredBarcodeTypes();

} // FulfillmentConstraint
