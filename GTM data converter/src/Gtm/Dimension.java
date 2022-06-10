/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dimension</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getDimension()
 * @model
 * @generated
 */
public enum Dimension implements Enumerator {
	/**
	 * The '<em><b>WEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHT(0, "WEIGHT", "WEIGHT"), /**
	 * The '<em><b>HEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HEIGHT(1, "HEIGHT", "HEIGHT"), /**
	 * The '<em><b>WIDTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_VALUE
	 * @generated
	 * @ordered
	 */
	WIDTH(2, "WIDTH", "WIDTH"), /**
	 * The '<em><b>LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(3, "LENGTH", "LENGTH"), /**
	 * The '<em><b>VOLUME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME_VALUE
	 * @generated
	 * @ordered
	 */
	VOLUME(4, "VOLUME", "VOLUME"), /**
	 * The '<em><b>WIDTH HEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WIDTH_HEIGHT(6, "WIDTH_HEIGHT", "WIDTH_HEIGHT"), /**
	 * The '<em><b>WIDTH LENGTH HEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_LENGTH_HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	WIDTH_LENGTH_HEIGHT(7, "WIDTH_LENGTH_HEIGHT", "WIDTH_LENGTH_HEIGHT")
	;

	/**
	 * The '<em><b>WEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHT_VALUE = 0;

/**
	 * The '<em><b>HEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEIGHT_VALUE = 1;

/**
	 * The '<em><b>WIDTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDTH_VALUE = 2;

/**
	 * The '<em><b>LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 3;

/**
	 * The '<em><b>VOLUME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLUME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLUME_VALUE = 4;

/**
	 * The '<em><b>WIDTH HEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_HEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDTH_HEIGHT_VALUE = 6;

/**
	 * The '<em><b>WIDTH LENGTH HEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIDTH_LENGTH_HEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIDTH_LENGTH_HEIGHT_VALUE = 7;

	/**
	 * An array of all the '<em><b>Dimension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Dimension[] VALUES_ARRAY =
		new Dimension[] {
			WEIGHT,
			HEIGHT,
			WIDTH,
			LENGTH,
			VOLUME,
			WIDTH_HEIGHT,
			WIDTH_LENGTH_HEIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Dimension</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Dimension> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dimension</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dimension get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dimension result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dimension getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dimension result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dimension</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dimension get(int value) {
		switch (value) {
			case WEIGHT_VALUE: return WEIGHT;
			case HEIGHT_VALUE: return HEIGHT;
			case WIDTH_VALUE: return WIDTH;
			case LENGTH_VALUE: return LENGTH;
			case VOLUME_VALUE: return VOLUME;
			case WIDTH_HEIGHT_VALUE: return WIDTH_HEIGHT;
			case WIDTH_LENGTH_HEIGHT_VALUE: return WIDTH_LENGTH_HEIGHT;
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
	private Dimension(int value, String name, String literal) {
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
	
} //Dimension
