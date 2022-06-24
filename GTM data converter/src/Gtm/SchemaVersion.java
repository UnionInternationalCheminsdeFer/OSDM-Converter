/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Schema Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getSchemaVersion()
 * @model
 * @generated
 */
public enum SchemaVersion implements Enumerator {
	/**
	 * The '<em><b>V12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V12_VALUE
	 * @generated
	 * @ordered
	 */
	V12(0, "V_1_2", "1.2"), /**
	 * The '<em><b>V14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V14_VALUE
	 * @generated
	 * @ordered
	 */
	V14(3, "V_1_4", "1.4"), /**
	 * The '<em><b>V15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V15_VALUE
	 * @generated
	 * @ordered
	 */
	V15(4, "V_1_5", "1.5");

	/**
	 * The '<em><b>V12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V12
	 * @model name="V_1_2" literal="1.2"
	 * @generated
	 * @ordered
	 */
	public static final int V12_VALUE = 0;

	/**
	 * The '<em><b>V14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V14
	 * @model name="V_1_4" literal="1.4"
	 * @generated
	 * @ordered
	 */
	public static final int V14_VALUE = 3;

	/**
	 * The '<em><b>V15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V15
	 * @model name="V_1_5" literal="1.5"
	 * @generated
	 * @ordered
	 */
	public static final int V15_VALUE = 4;

	/**
	 * An array of all the '<em><b>Schema Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchemaVersion[] VALUES_ARRAY =
		new SchemaVersion[] {
			V12,
			V14,
			V15,
		};

	/**
	 * A public read-only list of all the '<em><b>Schema Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchemaVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Schema Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaVersion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaVersion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaVersion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchemaVersion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Schema Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchemaVersion get(int value) {
		switch (value) {
			case V12_VALUE: return V12;
			case V14_VALUE: return V14;
			case V15_VALUE: return V15;
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
	private SchemaVersion(int value, String name, String literal) {
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
	
} //SchemaVersion
