/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.ZoneDefinitions#getZoneDefinition <em>Zone Definition</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getZoneDefinitions()
 * @model
 * @generated
 */
public interface ZoneDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Zone Definition</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ZoneDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Definition</em>' containment reference list.
	 * @see Gtm.GtmPackage#getZoneDefinitions_ZoneDefinition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ZoneDefinition> getZoneDefinition();

} // ZoneDefinitions
