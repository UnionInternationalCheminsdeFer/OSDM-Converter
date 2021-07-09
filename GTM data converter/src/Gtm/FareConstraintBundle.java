/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fare Constraint Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.FareConstraintBundle#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getDefaultRegulatoryConditions <em>Default Regulatory Conditions</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.FareConstraintBundle#getConvertedBundles <em>Converted Bundles</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getFareConstraintBundle()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SALES_AVAILABILITY_MUST TRAVEL_VALIDITY_MUST FULFILLMENT_CONSTRAINT_MUST COMBINATION_CONSTRAINT_MUST TOTAL_PASSENGER_CONSTRAINT_WARNING NOT_REFERENCED'"
 * @generated
 */
public interface FareConstraintBundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Default Fare Type</b></em>' attribute.
	 * The default value is <code>"NRT"</code>.
	 * The literals are from the enumeration {@link Gtm.FareType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Fare Type</em>' attribute.
	 * @see Gtm.FareType
	 * @see #setDefaultFareType(FareType)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_DefaultFareType()
	 * @model default="NRT" unique="false"
	 * @generated
	 */
	FareType getDefaultFareType();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getDefaultFareType <em>Default Fare Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Fare Type</em>' attribute.
	 * @see Gtm.FareType
	 * @see #getDefaultFareType()
	 * @generated
	 */
	void setDefaultFareType(FareType value);

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Constraint</em>' reference.
	 * @see #setCarrierConstraint(CarrierConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_CarrierConstraint()
	 * @model
	 * @generated
	 */
	CarrierConstraint getCarrierConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getCarrierConstraint <em>Carrier Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Constraint</em>' reference.
	 * @see #getCarrierConstraint()
	 * @generated
	 */
	void setCarrierConstraint(CarrierConstraint value);

	/**
	 * Returns the value of the '<em><b>Sales Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Availability</em>' reference.
	 * @see #setSalesAvailability(SalesAvailabilityConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_SalesAvailability()
	 * @model
	 * @generated
	 */
	SalesAvailabilityConstraint getSalesAvailability();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getSalesAvailability <em>Sales Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Availability</em>' reference.
	 * @see #getSalesAvailability()
	 * @generated
	 */
	void setSalesAvailability(SalesAvailabilityConstraint value);

	/**
	 * Returns the value of the '<em><b>Travel Validity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Validity</em>' reference.
	 * @see #setTravelValidity(TravelValidityConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_TravelValidity()
	 * @model
	 * @generated
	 */
	TravelValidityConstraint getTravelValidity();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getTravelValidity <em>Travel Validity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Validity</em>' reference.
	 * @see #getTravelValidity()
	 * @generated
	 */
	void setTravelValidity(TravelValidityConstraint value);

	/**
	 * Returns the value of the '<em><b>Combination Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combination Constraint</em>' reference.
	 * @see #setCombinationConstraint(CombinationConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_CombinationConstraint()
	 * @model
	 * @generated
	 */
	CombinationConstraint getCombinationConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getCombinationConstraint <em>Combination Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Constraint</em>' reference.
	 * @see #getCombinationConstraint()
	 * @generated
	 */
	void setCombinationConstraint(CombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Personal Data Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #setPersonalDataConstraint(PersonalDataConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_PersonalDataConstraint()
	 * @model
	 * @generated
	 */
	PersonalDataConstraint getPersonalDataConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getPersonalDataConstraint <em>Personal Data Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Data Constraint</em>' reference.
	 * @see #getPersonalDataConstraint()
	 * @generated
	 */
	void setPersonalDataConstraint(PersonalDataConstraint value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #setFulfillmentConstraint(FulfillmentConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_FulfillmentConstraint()
	 * @model
	 * @generated
	 */
	FulfillmentConstraint getFulfillmentConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getFulfillmentConstraint <em>Fulfillment Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Constraint</em>' reference.
	 * @see #getFulfillmentConstraint()
	 * @generated
	 */
	void setFulfillmentConstraint(FulfillmentConstraint value);

	/**
	 * Returns the value of the '<em><b>Total Passenger Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Passenger Constraint</em>' reference.
	 * @see #setTotalPassengerConstraint(TotalPassengerCombinationConstraint)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_TotalPassengerConstraint()
	 * @model
	 * @generated
	 */
	TotalPassengerCombinationConstraint getTotalPassengerConstraint();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getTotalPassengerConstraint <em>Total Passenger Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Passenger Constraint</em>' reference.
	 * @see #getTotalPassengerConstraint()
	 * @generated
	 */
	void setTotalPassengerConstraint(TotalPassengerCombinationConstraint value);

	/**
	 * Returns the value of the '<em><b>Default Regulatory Conditions</b></em>' attribute list.
	 * The list contents are of type {@link Gtm.RegulatoryCondition}.
	 * The literals are from the enumeration {@link Gtm.RegulatoryCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Regulatory Conditions</em>' attribute list.
	 * @see Gtm.RegulatoryCondition
	 * @see Gtm.GtmPackage#getFareConstraintBundle_DefaultRegulatoryConditions()
	 * @model
	 * @generated
	 */
	EList<RegulatoryCondition> getDefaultRegulatoryConditions();

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getFareConstraintBundle_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.FareConstraintBundle#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Converted Bundles</b></em>' reference list.
	 * The list contents are of type {@link Gtm.FareConstraintBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converted Bundles</em>' reference list.
	 * @see Gtm.GtmPackage#getFareConstraintBundle_ConvertedBundles()
	 * @model
	 * @generated
	 */
	EList<FareConstraintBundle> getConvertedBundles();

} // FareConstraintBundle
