/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trip Allocation Process</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTripAllocationProcess()
 * @model
 * @generated
 */
public enum TripAllocationProcess implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>MANUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(1, "MANUAL", "MANUAL"),

	/**
	 * The '<em><b>ACTIVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATION(2, "ACTIVATION", "ACTIVATION"),

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLMENT(3, "FULFILLMENT", "FULFILLMENT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>MANUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 1;

	/**
	 * The '<em><b>ACTIVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATION_VALUE = 2;

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Trip Allocation Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TripAllocationProcess[] VALUES_ARRAY =
		new TripAllocationProcess[] {
			NONE,
			MANUAL,
			ACTIVATION,
			FULFILLMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Trip Allocation Process</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TripAllocationProcess> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trip Allocation Process</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripAllocationProcess get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripAllocationProcess result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trip Allocation Process</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripAllocationProcess getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripAllocationProcess result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trip Allocation Process</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripAllocationProcess get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case MANUAL_VALUE: return MANUAL;
			case ACTIVATION_VALUE: return ACTIVATION;
			case FULFILLMENT_VALUE: return FULFILLMENT;
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
	private TripAllocationProcess(int value, String name, String literal) {
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
	
} //TripAllocationProcess
