/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Character Set</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getCharacterSet()
 * @model
 * @generated
 */
public enum CharacterSet implements Enumerator {
	/**
	 * The '<em><b>COUNTRY DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNTRY_DEFAULT(0, "COUNTRY_DEFAULT", "COUNTRY_DEFAULT"), /**
	 * The '<em><b>LATIN1 ISO88591</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN1_ISO88591_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN1_ISO88591(1, "LATIN1_ISO88591", "LATIN-1_ISO-8859-1"),

	/**
	 * The '<em><b>LATIN2 ISO88592</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN2_ISO88592_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN2_ISO88592(2, "LATIN2_ISO88592", "LATIN-2_ISO-8859-2"),

	/**
	 * The '<em><b>LATINGREEK ISO88597</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINGREEK_ISO88597_VALUE
	 * @generated
	 * @ordered
	 */
	LATINGREEK_ISO88597(3, "LATINGREEK_ISO88597", "LATIN-GREEK_ISO-8859-7"), /**
	 * The '<em><b>RUSSIAN KOI8R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_KOI8R_VALUE
	 * @generated
	 * @ordered
	 */
	RUSSIAN_KOI8R(4, "RUSSIAN_KOI8R", "RUSSIAN_KOI8-R"),

	/**
	 * The '<em><b>USASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USASCII_VALUE
	 * @generated
	 * @ordered
	 */
	USASCII(5, "USASCII", "USASCII"),

	/**
	 * The '<em><b>UKRAINIAN KOI8U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UKRAINIAN_KOI8U_VALUE
	 * @generated
	 * @ordered
	 */
	UKRAINIAN_KOI8U(6, "UKRAINIAN_KOI8U", "UKRAINIAN_KOI8U"),

	/**
	 * The '<em><b>LATIN4 ISO88594</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN4_ISO88594_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN4_ISO88594(7, "LATIN4_ISO88594", "LATIN-4_ISO-8859-4"),

	/**
	 * The '<em><b>LATINKYRILLIC ISO88595</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINKYRILLIC_ISO88595_VALUE
	 * @generated
	 * @ordered
	 */
	LATINKYRILLIC_ISO88595(8, "LATINKYRILLIC_ISO88595", "LATINKYRILLIC_ISO88595"),

	/**
	 * The '<em><b>LATIN5 ISO88599</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN5_ISO88599_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN5_ISO88599(9, "LATIN5_ISO88599", "LATIN5_ISO88599"),

	/**
	 * The '<em><b>LATIN7 ISO885913</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN7_ISO885913_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN7_ISO885913(10, "LATIN7_ISO885913", "LATIN7_ISO885913"),

	/**
	 * The '<em><b>LATIN9 ISO885915</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN9_ISO885915_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN9_ISO885915(11, "LATIN9_ISO885915", "LATIN9_ISO885915"), /**
	 * The '<em><b>LATIN3 ISO88593</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN3_ISO88593_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN3_ISO88593(12, "LATIN3_ISO88593", "LATIN3_ISO88593"), /**
	 * The '<em><b>LATINARABIC ISO88596</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINARABIC_ISO88596_VALUE
	 * @generated
	 * @ordered
	 */
	LATINARABIC_ISO88596(13, "LATINARABIC_ISO88596", "LATINARABIC_ISO88596"), /**
	 * The '<em><b>LATINHEBREW ISO88598</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINHEBREW_ISO88598_VALUE
	 * @generated
	 * @ordered
	 */
	LATINHEBREW_ISO88598(14, "LATINHEBREW_ISO88598", "LATINHEBREW_ISO88598"), /**
	 * The '<em><b>LATIN10 ISO885916</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN10_ISO885916_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN10_ISO885916(16, "LATIN10_ISO885916", "LATIN10_ISO885916");

	/**
	 * The '<em><b>COUNTRY DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNTRY_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUNTRY_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>LATIN1 ISO88591</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN1_ISO88591
	 * @model literal="LATIN-1_ISO-8859-1"
	 * @generated
	 * @ordered
	 */
	public static final int LATIN1_ISO88591_VALUE = 1;

	/**
	 * The '<em><b>LATIN2 ISO88592</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN2_ISO88592
	 * @model literal="LATIN-2_ISO-8859-2"
	 * @generated
	 * @ordered
	 */
	public static final int LATIN2_ISO88592_VALUE = 2;

	/**
	 * The '<em><b>LATINGREEK ISO88597</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINGREEK_ISO88597
	 * @model literal="LATIN-GREEK_ISO-8859-7"
	 * @generated
	 * @ordered
	 */
	public static final int LATINGREEK_ISO88597_VALUE = 3;

	/**
	 * The '<em><b>RUSSIAN KOI8R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUSSIAN_KOI8R
	 * @model literal="RUSSIAN_KOI8-R"
	 * @generated
	 * @ordered
	 */
	public static final int RUSSIAN_KOI8R_VALUE = 4;

	/**
	 * The '<em><b>USASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USASCII
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USASCII_VALUE = 5;

	/**
	 * The '<em><b>UKRAINIAN KOI8U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UKRAINIAN_KOI8U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UKRAINIAN_KOI8U_VALUE = 6;

	/**
	 * The '<em><b>LATIN4 ISO88594</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN4_ISO88594
	 * @model literal="LATIN-4_ISO-8859-4"
	 * @generated
	 * @ordered
	 */
	public static final int LATIN4_ISO88594_VALUE = 7;

	/**
	 * The '<em><b>LATINKYRILLIC ISO88595</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINKYRILLIC_ISO88595
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATINKYRILLIC_ISO88595_VALUE = 8;

	/**
	 * The '<em><b>LATIN5 ISO88599</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN5_ISO88599
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN5_ISO88599_VALUE = 9;

	/**
	 * The '<em><b>LATIN7 ISO885913</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN7_ISO885913
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN7_ISO885913_VALUE = 10;

	/**
	 * The '<em><b>LATIN9 ISO885915</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN9_ISO885915
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN9_ISO885915_VALUE = 11;

	/**
	 * The '<em><b>LATIN3 ISO88593</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN3_ISO88593
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN3_ISO88593_VALUE = 12;

	/**
	 * The '<em><b>LATINARABIC ISO88596</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINARABIC_ISO88596
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATINARABIC_ISO88596_VALUE = 13;

	/**
	 * The '<em><b>LATINHEBREW ISO88598</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATINHEBREW_ISO88598
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATINHEBREW_ISO88598_VALUE = 14;

	/**
	 * The '<em><b>LATIN10 ISO885916</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN10_ISO885916
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN10_ISO885916_VALUE = 16;

	/**
	 * An array of all the '<em><b>Character Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CharacterSet[] VALUES_ARRAY =
		new CharacterSet[] {
			COUNTRY_DEFAULT,
			LATIN1_ISO88591,
			LATIN2_ISO88592,
			LATINGREEK_ISO88597,
			RUSSIAN_KOI8R,
			USASCII,
			UKRAINIAN_KOI8U,
			LATIN4_ISO88594,
			LATINKYRILLIC_ISO88595,
			LATIN5_ISO88599,
			LATIN7_ISO885913,
			LATIN9_ISO885915,
			LATIN3_ISO88593,
			LATINARABIC_ISO88596,
			LATINHEBREW_ISO88598,
			LATIN10_ISO885916,
		};

	/**
	 * A public read-only list of all the '<em><b>Character Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CharacterSet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Character Set</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacterSet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacterSet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Character Set</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacterSet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CharacterSet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Character Set</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CharacterSet get(int value) {
		switch (value) {
			case COUNTRY_DEFAULT_VALUE: return COUNTRY_DEFAULT;
			case LATIN1_ISO88591_VALUE: return LATIN1_ISO88591;
			case LATIN2_ISO88592_VALUE: return LATIN2_ISO88592;
			case LATINGREEK_ISO88597_VALUE: return LATINGREEK_ISO88597;
			case RUSSIAN_KOI8R_VALUE: return RUSSIAN_KOI8R;
			case USASCII_VALUE: return USASCII;
			case UKRAINIAN_KOI8U_VALUE: return UKRAINIAN_KOI8U;
			case LATIN4_ISO88594_VALUE: return LATIN4_ISO88594;
			case LATINKYRILLIC_ISO88595_VALUE: return LATINKYRILLIC_ISO88595;
			case LATIN5_ISO88599_VALUE: return LATIN5_ISO88599;
			case LATIN7_ISO885913_VALUE: return LATIN7_ISO885913;
			case LATIN9_ISO885915_VALUE: return LATIN9_ISO885915;
			case LATIN3_ISO88593_VALUE: return LATIN3_ISO88593;
			case LATINARABIC_ISO88596_VALUE: return LATINARABIC_ISO88596;
			case LATINHEBREW_ISO88598_VALUE: return LATINHEBREW_ISO88598;
			case LATIN10_ISO885916_VALUE: return LATIN10_ISO885916;
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
	private CharacterSet(int value, String name, String literal) {
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
	
} //CharacterSet
