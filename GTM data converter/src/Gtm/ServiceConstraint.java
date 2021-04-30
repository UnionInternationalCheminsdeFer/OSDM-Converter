/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ServiceConstraint#getId <em>Id</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getIncludedServiceBrands <em>Included Service Brands</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getExcludedServiceBrands <em>Excluded Service Brands</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getDataDescription <em>Data Description</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getLegacy108Code <em>Legacy108 Code</em>}</li>
 *   <li>{@link Gtm.ServiceConstraint#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getServiceConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='INCLUDE_OR_EXCLUDE LEGACY_CODE_RANGE'"
 * @generated
 */
public interface ServiceConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Gtm.GtmPackage#getServiceConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Gtm.ServiceConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Included Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getServiceConstraint_IncludedServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getIncludedServiceBrands();

	/**
	 * Returns the value of the '<em><b>Excluded Service Brands</b></em>' reference list.
	 * The list contents are of type {@link Gtm.ServiceBrand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Service Brands</em>' reference list.
	 * @see Gtm.GtmPackage#getServiceConstraint_ExcludedServiceBrands()
	 * @model
	 * @generated
	 */
	EList<ServiceBrand> getExcludedServiceBrands();

	/**
	 * Returns the value of the '<em><b>Data Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Description</em>' attribute.
	 * @see #setDataDescription(String)
	 * @see Gtm.GtmPackage#getServiceConstraint_DataDescription()
	 * @model
	 * @generated
	 */
	String getDataDescription();

	/**
	 * Sets the value of the '{@link Gtm.ServiceConstraint#getDataDescription <em>Data Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Description</em>' attribute.
	 * @see #getDataDescription()
	 * @generated
	 */
	void setDataDescription(String value);

	/**
	 * Returns the value of the '<em><b>Legacy108 Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy108 Code</em>' attribute.
	 * @see #setLegacy108Code(int)
	 * @see Gtm.GtmPackage#getServiceConstraint_Legacy108Code()
	 * @model
	 * @generated
	 */
	int getLegacy108Code();

	/**
	 * Sets the value of the '{@link Gtm.ServiceConstraint#getLegacy108Code <em>Legacy108 Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy108 Code</em>' attribute.
	 * @see #getLegacy108Code()
	 * @generated
	 */
	void setLegacy108Code(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(Text)
	 * @see Gtm.GtmPackage#getServiceConstraint_Description()
	 * @model
	 * @generated
	 */
	Text getDescription();

	/**
	 * Sets the value of the '{@link Gtm.ServiceConstraint#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Text value);

} // ServiceConstraint
