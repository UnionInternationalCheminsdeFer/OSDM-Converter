/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getConditionType()
 * @model
 * @generated
 */
public enum ConditionType implements Enumerator {
	/**
	 * The '<em><b>SALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALE_VALUE
	 * @generated
	 * @ordered
	 */
	SALE(0, "SALE", "SALE"),

	/**
	 * The '<em><b>PLACE CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE_CHANGE(1, "PLACE_CHANGE", "PLACE_CHANGE"),

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FULFILLMENT(2, "FULFILLMENT", "FULFILLMENT"),

	/**
	 * The '<em><b>TRAVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVEL(3, "TRAVEL", "TRAVEL"),

	/**
	 * The '<em><b>REFUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUND_VALUE
	 * @generated
	 * @ordered
	 */
	REFUND(4, "REFUND", "REFUND"),

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE(5, "EXCHANGE", "EXCHANGE");

	/**
	 * The '<em><b>SALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SALE_VALUE = 0;

	/**
	 * The '<em><b>PLACE CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_CHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_CHANGE_VALUE = 1;

	/**
	 * The '<em><b>FULFILLMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULFILLMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULFILLMENT_VALUE = 2;

	/**
	 * The '<em><b>TRAVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVEL_VALUE = 3;

	/**
	 * The '<em><b>REFUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFUND_VALUE = 4;

	/**
	 * The '<em><b>EXCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionType[] VALUES_ARRAY =
		new ConditionType[] {
			SALE,
			PLACE_CHANGE,
			FULFILLMENT,
			TRAVEL,
			REFUND,
			EXCHANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(int value) {
		switch (value) {
			case SALE_VALUE: return SALE;
			case PLACE_CHANGE_VALUE: return PLACE_CHANGE;
			case FULFILLMENT_VALUE: return FULFILLMENT;
			case TRAVEL_VALUE: return TRAVEL;
			case REFUND_VALUE: return REFUND;
			case EXCHANGE_VALUE: return EXCHANGE;
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
	private ConditionType(int value, String name, String literal) {
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
	
} //ConditionType
