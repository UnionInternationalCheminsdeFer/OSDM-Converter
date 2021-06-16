/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rounding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getRoundingType()
 * @model
 * @generated
 */
public enum RoundingType implements Enumerator {
	/**
	 * The '<em><b>HALFUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFUP_VALUE
	 * @generated
	 * @ordered
	 */
	HALFUP(0, "HALFUP", "HALFUP"),

	/**
	 * The '<em><b>DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(1, "DOWN", "DOWN"),

	/**
	 * The '<em><b>HALFEVEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFEVEN_VALUE
	 * @generated
	 * @ordered
	 */
	HALFEVEN(2, "HALFEVEN", "HALFEVEN"),

	/**
	 * The '<em><b>UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(3, "UP", "UP"),

	/**
	 * The '<em><b>HALFDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HALFDOWN(4, "HALFDOWN", "HALFDOWN"), /**
	 * The '<em><b>UP5CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP5CENT_VALUE
	 * @generated
	 * @ordered
	 */
	UP5CENT(5, "UP5CENT", "UP5CENT"), /**
	 * The '<em><b>DOWN5CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN5CENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN5CENT(6, "DOWN5CENT", "DOWN5CENT"), /**
	 * The '<em><b>UP2CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP2CENT_VALUE
	 * @generated
	 * @ordered
	 */
	UP2CENT(7, "UP2CENT", "UP2CENT"), /**
	 * The '<em><b>DOWN2CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN2CENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN2CENT(8, "DOWN2CENT", "DOWN2CENT"), /**
	 * The '<em><b>UP10CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP10CENT_VALUE
	 * @generated
	 * @ordered
	 */
	UP10CENT(9, "UP10CENT", "UP10CENT"), /**
	 * The '<em><b>DOWN10CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN10CENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN10CENT(10, "DOWN10CENT", "DOWN10CENT"), /**
	 * The '<em><b>HALFUP10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFUP10_VALUE
	 * @generated
	 * @ordered
	 */
	HALFUP10(11, "HALFUP10", "HALFUP10"), /**
	 * The '<em><b>HALFDOWN10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFDOWN10_VALUE
	 * @generated
	 * @ordered
	 */
	HALFDOWN10(12, "HALFDOWN10", "HALFDOWN10"), /**
	 * The '<em><b>HALFEVEN10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFEVEN10_VALUE
	 * @generated
	 * @ordered
	 */
	HALFEVEN10(13, "HALFEVEN10", "HALFEVEN10"), /**
	 * The '<em><b>UP20CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP20CENT_VALUE
	 * @generated
	 * @ordered
	 */
	UP20CENT(9, "UP20CENT", "UP20CENT"), /**
	 * The '<em><b>DOWN20CENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN20CENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN20CENT(10, "DOWN20CENT", "DOWN20CENT");

	/**
	 * The '<em><b>HALFUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFUP_VALUE = 0;

	/**
	 * The '<em><b>DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 1;

	/**
	 * The '<em><b>HALFEVEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFEVEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFEVEN_VALUE = 2;

	/**
	 * The '<em><b>UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 3;

	/**
	 * The '<em><b>HALFDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFDOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFDOWN_VALUE = 4;

	/**
	 * The '<em><b>UP5CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP5CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP5CENT_VALUE = 5;

	/**
	 * The '<em><b>DOWN5CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN5CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN5CENT_VALUE = 6;

	/**
	 * The '<em><b>UP2CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP2CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP2CENT_VALUE = 7;

	/**
	 * The '<em><b>DOWN2CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN2CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN2CENT_VALUE = 8;

	/**
	 * The '<em><b>UP10CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP10CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP10CENT_VALUE = 9;

	/**
	 * The '<em><b>DOWN10CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN10CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN10CENT_VALUE = 10;

	/**
	 * The '<em><b>HALFUP10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFUP10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFUP10_VALUE = 11;

	/**
	 * The '<em><b>HALFDOWN10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFDOWN10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFDOWN10_VALUE = 12;

	/**
	 * The '<em><b>HALFEVEN10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFEVEN10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HALFEVEN10_VALUE = 13;

	/**
	 * The '<em><b>UP20CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP20CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP20CENT_VALUE = 9;

	/**
	 * The '<em><b>DOWN20CENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN20CENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN20CENT_VALUE = 10;

	/**
	 * An array of all the '<em><b>Rounding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoundingType[] VALUES_ARRAY =
		new RoundingType[] {
			HALFUP,
			DOWN,
			HALFEVEN,
			UP,
			HALFDOWN,
			UP5CENT,
			DOWN5CENT,
			UP2CENT,
			DOWN2CENT,
			UP10CENT,
			DOWN10CENT,
			HALFUP10,
			HALFDOWN10,
			HALFEVEN10,
			UP20CENT,
			DOWN20CENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Rounding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoundingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rounding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoundingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoundingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rounding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoundingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoundingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rounding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoundingType get(int value) {
		switch (value) {
			case HALFUP_VALUE: return HALFUP;
			case DOWN_VALUE: return DOWN;
			case HALFEVEN_VALUE: return HALFEVEN;
			case UP_VALUE: return UP;
			case HALFDOWN_VALUE: return HALFDOWN;
			case UP5CENT_VALUE: return UP5CENT;
			case DOWN5CENT_VALUE: return DOWN5CENT;
			case UP2CENT_VALUE: return UP2CENT;
			case DOWN2CENT_VALUE: return DOWN2CENT;
			case UP10CENT_VALUE: return UP10CENT;
			case DOWN10CENT_VALUE: return DOWN10CENT;
			case HALFUP10_VALUE: return HALFUP10;
			case HALFDOWN10_VALUE: return HALFDOWN10;
			case HALFEVEN10_VALUE: return HALFEVEN10;
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
	private RoundingType(int value, String name, String literal) {
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
	
} //RoundingType
