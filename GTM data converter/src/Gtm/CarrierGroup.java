/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.CarrierGroup#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getCode <em>Code</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getName <em>Name</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getLegacyCode <em>Legacy Code</em>}</li>
 *   <li>{@link Gtm.CarrierGroup#getCompanies <em>Companies</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getCarrierGroup()
 * @model
 * @generated
 */
public interface CarrierGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' attribute.
	 * The literals are from the enumeration {@link Gtm.DataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #setDataSource(DataSource)
	 * @see Gtm.GtmPackage#getCarrierGroup_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getDataSource <em>Data Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' attribute.
	 * @see Gtm.DataSource
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getCarrierGroup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getId <em>Id</em>}' attribute.
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
	 * @see Gtm.GtmPackage#getCarrierGroup_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gtm.GtmPackage#getCarrierGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Text)
	 * @see Gtm.GtmPackage#getCarrierGroup_Description()
	 * @model
	 * @generated
	 */
	Text getDescription();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Text value);

	/**
	 * Returns the value of the '<em><b>Legacy Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Code</em>' attribute.
	 * @see #setLegacyCode(String)
	 * @see Gtm.GtmPackage#getCarrierGroup_LegacyCode()
	 * @model
	 * @generated
	 */
	String getLegacyCode();

	/**
	 * Sets the value of the '{@link Gtm.CarrierGroup#getLegacyCode <em>Legacy Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Code</em>' attribute.
	 * @see #getLegacyCode()
	 * @generated
	 */
	void setLegacyCode(String value);

	/**
	 * Returns the value of the '<em><b>Companies</b></em>' reference list.
	 * The list contents are of type {@link Gtm.Carrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companies</em>' reference list.
	 * @see Gtm.GtmPackage#getCarrierGroup_Companies()
	 * @model
	 * @generated
	 */
	EList<Carrier> getCompanies();

} // CarrierGroup
