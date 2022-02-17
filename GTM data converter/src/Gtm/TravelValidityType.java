/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Travel Validity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTravelValidityType()
 * @model
 * @generated
 */
public enum TravelValidityType implements Enumerator {
	/**
	 * The '<em><b>SINGLE TRIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE_TRIP(0, "SINGLE_TRIP", "SINGLE_TRIP"),

	/**
	 * The '<em><b>MULTIPLE TRIPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_TRIPS_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_TRIPS(1, "MULTIPLE_TRIPS", "MULTIPLE_TRIPS"),

	/**
	 * The '<em><b>UNRESTRICTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESTRICTED_VALUE
	 * @generated
	 * @ordered
	 */
	UNRESTRICTED(2, "UNRESTRICTED", "UNRESTRICTED");

	/**
	 * The '<em><b>SINGLE TRIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_TRIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_TRIP_VALUE = 0;

	/**
	 * The '<em><b>MULTIPLE TRIPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_TRIPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_TRIPS_VALUE = 1;

	/**
	 * The '<em><b>UNRESTRICTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNRESTRICTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNRESTRICTED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Travel Validity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TravelValidityType[] VALUES_ARRAY =
		new TravelValidityType[] {
			SINGLE_TRIP,
			MULTIPLE_TRIPS,
			UNRESTRICTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Travel Validity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TravelValidityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Travel Validity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelValidityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelValidityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Validity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelValidityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TravelValidityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Travel Validity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TravelValidityType get(int value) {
		switch (value) {
			case SINGLE_TRIP_VALUE: return SINGLE_TRIP;
			case MULTIPLE_TRIPS_VALUE: return MULTIPLE_TRIPS;
			case UNRESTRICTED_VALUE: return UNRESTRICTED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TravelValidityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TravelValidityType
