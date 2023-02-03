/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Products</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Products#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getProducts()
 * @model
 * @generated
 */
public interface Products extends EObject {
	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see Gtm.GtmPackage#getProducts_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

} // Products
