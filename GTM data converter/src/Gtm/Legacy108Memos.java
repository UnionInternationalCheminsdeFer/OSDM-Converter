/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy108 Memos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Legacy108Memos#getLegacyMemos <em>Legacy Memos</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getLegacy108Memos()
 * @model
 * @generated
 */
public interface Legacy108Memos extends EObject {
	/**
	 * Returns the value of the '<em><b>Legacy Memos</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.Legacy108Memo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Memos</em>' containment reference list.
	 * @see Gtm.GtmPackage#getLegacy108Memos_LegacyMemos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Legacy108Memo> getLegacyMemos();

} // Legacy108Memos
