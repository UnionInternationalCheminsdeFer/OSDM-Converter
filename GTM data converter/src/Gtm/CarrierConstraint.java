/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CarrierConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.CarrierConstraint#getIncludedCarriers <em>Included Carriers</em>}</li>
 *   <li>{@link Gtm.CarrierConstraint#getExcludedCarriers <em>Excluded Carriers</em>}</li>
 *   <li>{@link Gtm.CarrierConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.CarrierConstraint#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.CarrierConstraint#getIncludedCarrierGroup <em>Included Carrier Group</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarrierConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='INCLUDE_OR_EXCLUDE'"
 * @generated
 */
public interface CarrierConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getCarrierConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.CarrierConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Included Carriers</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Carriers</em>' reference list.
	 * @see Gtm.GtmPackage#getCarrierConstraint_IncludedCarriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getIncludedCarriers();

	/**
	 * Returns the value of the '<em><b>Excluded Carriers</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Carriers</em>' reference list.
	 * @see Gtm.GtmPackage#getCarrierConstraint_ExcludedCarriers()
	 * @model
	 * @generated
	 */
	EList<Carrier> getExcludedCarriers();

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getCarrierConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.CarrierConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getCarrierConstraint_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.CarrierConstraint#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Included Carrier Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Carrier Group</em>' reference.
	 * @see #setIncludedCarrierGroup(CarrierGroup)
	 * @see Gtm.GtmPackage#getCarrierConstraint_IncludedCarrierGroup()
	 * @model
	 * @generated
	 */
	CarrierGroup getIncludedCarrierGroup();

	/**
	 * Sets the value of the '{@link Gtm.CarrierConstraint#getIncludedCarrierGroup <em>Included Carrier Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included Carrier Group</em>' reference.
	 * @see #getIncludedCarrierGroup()
	 * @generated
	 */
	void setIncludedCarrierGroup(CarrierGroup value);

} // CarrierConstraint
