/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Legacy Series Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getLegacySeriesType()
 * @model
 * @generated
 */
public enum LegacySeriesType implements Enumerator {
	/**
	 * The '<em><b>Border destination</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_DESTINATION_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER_DESTINATION(2, "border_destination", "border_destination"),

	/**
	 * The '<em><b>Transit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSIT(1, "transit", "transit"),

	/**
	 * The '<em><b>Station station</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATION_STATION_VALUE
	 * @generated
	 * @ordered
	 */
	STATION_STATION(2, "station_station", "station_station");

	/**
	 * The '<em><b>Border destination</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_DESTINATION
	 * @model name="border_destination"
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_DESTINATION_VALUE = 2;

	/**
	 * The '<em><b>Transit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSIT
	 * @model name="transit"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSIT_VALUE = 1;

	/**
	 * The '<em><b>Station station</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATION_STATION
	 * @model name="station_station"
	 * @generated
	 * @ordered
	 */
	public static final int STATION_STATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Legacy Series Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LegacySeriesType[] VALUES_ARRAY =
		new LegacySeriesType[] {
			BORDER_DESTINATION,
			TRANSIT,
			STATION_STATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Legacy Series Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LegacySeriesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Legacy Series Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacySeriesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegacySeriesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legacy Series Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacySeriesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LegacySeriesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Legacy Series Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LegacySeriesType get(int value) {
		switch (value) {
			case BORDER_DESTINATION_VALUE: return BORDER_DESTINATION;
			case TRANSIT_VALUE: return TRANSIT;
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
	private LegacySeriesType(int value, String name, String literal) {
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
	
} //LegacySeriesType
