/**
 */
package Gtm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gtm.Route#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see Gtm.GtmPackage#getRoute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AT_LEAST_ONE_VIA'"
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link Gtm.ViaStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see Gtm.GtmPackage#getRoute_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViaStation> getStations();

} // Route
