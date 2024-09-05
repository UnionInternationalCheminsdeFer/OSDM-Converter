/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Product Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getProductType()
 * @model
 * @generated
 */
public enum ProductType implements Enumerator {
	/**
	 * The '<em><b>ADMISSION POINT2POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_POINT2POINT_VALUE
	 * @generated
	 * @ordered
	 */
	ADMISSION_POINT2POINT(0, "ADMISSION_POINT2POINT", "ADMISSION_POINT2POINT"),

	/**
	 * The '<em><b>ADMISSION PASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	ADMISSION_PASS(1, "ADMISSION_PASS", "ADMISSION_PASS"),

	/**
	 * The '<em><b>ADMISSION MULTI RIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_MULTI_RIDE_VALUE
	 * @generated
	 * @ordered
	 */
	ADMISSION_MULTI_RIDE(2, "ADMISSION_MULTI_RIDE", "ADMISSION_MULTI_RIDE"),

	/**
	 * The '<em><b>UPGRADE POINT2POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_POINT2POINT_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE_POINT2POINT(3, "UPGRADE_POINT2POINT", "UPGRADE_POINT2POINT"),

	/**
	 * The '<em><b>UPGRADE PASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE_PASS(4, "UPGRADE_PASS", "UPGRADE_PASS"),

	/**
	 * The '<em><b>UPGRADE MULTI RIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_MULTI_RIDE_VALUE
	 * @generated
	 * @ordered
	 */
	UPGRADE_MULTI_RIDE(5, "UPGRADE_MULTI_RIDE", "UPGRADE_MULTI_RIDE"),

	/**
	 * The '<em><b>RESERVATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVATION(6, "RESERVATION", "RESERVATION"),

	/**
	 * The '<em><b>ANCILLARY SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCILLARY_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	ANCILLARY_SERVICE(7, "ANCILLARY_SERVICE", "ANCILLARY_SERVICE"),

	/**
	 * The '<em><b>ANCILLARY ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCILLARY_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ANCILLARY_ITEM(8, "ANCILLARY_ITEM", "ANCILLARY_ITEM"),

	/**
	 * The '<em><b>REDUCTION CARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCTION_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCTION_CARD(9, "REDUCTION_CARD", "REDUCTION_CARD");

	/**
	 * The '<em><b>ADMISSION POINT2POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_POINT2POINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMISSION_POINT2POINT_VALUE = 0;

	/**
	 * The '<em><b>ADMISSION PASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_PASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMISSION_PASS_VALUE = 1;

	/**
	 * The '<em><b>ADMISSION MULTI RIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMISSION_MULTI_RIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMISSION_MULTI_RIDE_VALUE = 2;

	/**
	 * The '<em><b>UPGRADE POINT2POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_POINT2POINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_POINT2POINT_VALUE = 3;

	/**
	 * The '<em><b>UPGRADE PASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_PASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_PASS_VALUE = 4;

	/**
	 * The '<em><b>UPGRADE MULTI RIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPGRADE_MULTI_RIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPGRADE_MULTI_RIDE_VALUE = 5;

	/**
	 * The '<em><b>RESERVATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_VALUE = 6;

	/**
	 * The '<em><b>ANCILLARY SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCILLARY_SERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANCILLARY_SERVICE_VALUE = 7;

	/**
	 * The '<em><b>ANCILLARY ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCILLARY_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANCILLARY_ITEM_VALUE = 8;

	/**
	 * The '<em><b>REDUCTION CARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCTION_CARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDUCTION_CARD_VALUE = 9;

	/**
	 * An array of all the '<em><b>Product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProductType[] VALUES_ARRAY =
		new ProductType[] {
			ADMISSION_POINT2POINT,
			ADMISSION_PASS,
			ADMISSION_MULTI_RIDE,
			UPGRADE_POINT2POINT,
			UPGRADE_PASS,
			UPGRADE_MULTI_RIDE,
			RESERVATION,
			ANCILLARY_SERVICE,
			ANCILLARY_ITEM,
			REDUCTION_CARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProductType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Product Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProductType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Product Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProductType get(int value) {
		switch (value) {
			case ADMISSION_POINT2POINT_VALUE: return ADMISSION_POINT2POINT;
			case ADMISSION_PASS_VALUE: return ADMISSION_PASS;
			case ADMISSION_MULTI_RIDE_VALUE: return ADMISSION_MULTI_RIDE;
			case UPGRADE_POINT2POINT_VALUE: return UPGRADE_POINT2POINT;
			case UPGRADE_PASS_VALUE: return UPGRADE_PASS;
			case UPGRADE_MULTI_RIDE_VALUE: return UPGRADE_MULTI_RIDE;
			case RESERVATION_VALUE: return RESERVATION;
			case ANCILLARY_SERVICE_VALUE: return ANCILLARY_SERVICE;
			case ANCILLARY_ITEM_VALUE: return ANCILLARY_ITEM;
			case REDUCTION_CARD_VALUE: return REDUCTION_CARD;
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
	private ProductType(int value, String name, String literal) {
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
	
} //ProductType
