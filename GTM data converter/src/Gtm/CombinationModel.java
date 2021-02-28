/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Combination Model</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getCombinationModel()
 * @model
 * @generated
 */
public enum CombinationModel implements Enumerator {
	/**
	 * The '<em><b>CLUSTERING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(3, "CLUSTERING", "CLUSTERING"), /**
	 * The '<em><b>SEPARATE CONTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATE_CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATE_CONTRACT(2, "SEPARATE_CONTRACT", "SEPARATE_CONTRACT"),
	/**
	 * The '<em><b>COMBINING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBINING_VALUE
	 * @generated
	 * @ordered
	 */
	COMBINING(4, "COMBINING", "COMBINING");

	/**
	 * The '<em><b>CLUSTERING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 3;

	/**
	 * The '<em><b>SEPARATE CONTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATE_CONTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATE_CONTRACT_VALUE = 2;

	/**
	 * The '<em><b>COMBINING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBINING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMBINING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Combination Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CombinationModel[] VALUES_ARRAY =
		new CombinationModel[] {
			CLUSTERING,
			SEPARATE_CONTRACT,
			COMBINING,
		};

	/**
	 * A public read-only list of all the '<em><b>Combination Model</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CombinationModel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Combination Model</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationModel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombinationModel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combination Model</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationModel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombinationModel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combination Model</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationModel get(int value) {
		switch (value) {
			case CLUSTERING_VALUE: return CLUSTERING;
			case SEPARATE_CONTRACT_VALUE: return SEPARATE_CONTRACT;
			case COMBINING_VALUE: return COMBINING;
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
	private CombinationModel(int value, String name, String literal) {
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
	
} //CombinationModel
