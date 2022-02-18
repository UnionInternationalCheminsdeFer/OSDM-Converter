/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Add Carrier Scope</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getAddCarrierScope()
 * @model
 * @generated
 */
public enum AddCarrierScope implements Enumerator {
	/**
	 * The '<em><b>CARRIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER(0, "CARRIER", "CARRIER"),

	/**
	 * The '<em><b>TCO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCO_VALUE
	 * @generated
	 * @ordered
	 */
	TCO(1, "TCO", "TCO"),

	/**
	 * The '<em><b>TCO AND CARRIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCO_AND_CARRIER_VALUE
	 * @generated
	 * @ordered
	 */
	TCO_AND_CARRIER(2, "TCO_AND_CARRIER", "TCO_AND_CARRIER");

	/**
	 * The '<em><b>CARRIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_VALUE = 0;

	/**
	 * The '<em><b>TCO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCO_VALUE = 1;

	/**
	 * The '<em><b>TCO AND CARRIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCO_AND_CARRIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TCO_AND_CARRIER_VALUE = 2;

	/**
	 * An array of all the '<em><b>Add Carrier Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddCarrierScope[] VALUES_ARRAY =
		new AddCarrierScope[] {
			CARRIER,
			TCO,
			TCO_AND_CARRIER,
		};

	/**
	 * A public read-only list of all the '<em><b>Add Carrier Scope</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddCarrierScope> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Add Carrier Scope</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddCarrierScope get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddCarrierScope result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Add Carrier Scope</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddCarrierScope getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddCarrierScope result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Add Carrier Scope</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddCarrierScope get(int value) {
		switch (value) {
			case CARRIER_VALUE: return CARRIER;
			case TCO_VALUE: return TCO;
			case TCO_AND_CARRIER_VALUE: return TCO_AND_CARRIER;
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
	private AddCarrierScope(int value, String name, String literal) {
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
	
} //AddCarrierScope
