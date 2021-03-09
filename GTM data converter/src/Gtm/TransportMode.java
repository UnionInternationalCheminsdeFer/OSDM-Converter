/**
 */
package Gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transport Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gtm.GtmPackage#getTransportMode()
 * @model
 * @generated
 */
public enum TransportMode implements Enumerator {
	/**
	 * The '<em><b>Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIN(37, "train", "train"),

	/**
	 * The '<em><b>Ship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SHIP(33, "ship", "ship"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(32, "bus", "bus"),

	/**
	 * The '<em><b>High Speed Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_SPEED_TRAIN(8, "highSpeedTrain", "highSpeedTrain"),

	/**
	 * The '<em><b>Intercity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERCITY(9, "intercity", "intercity"),

	/**
	 * The '<em><b>Inter Regional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_REGIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	INTER_REGIONAL(10, "interRegional", "interRegional"),

	/**
	 * The '<em><b>Regional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL(11, "regional", "regional"),

	/**
	 * The '<em><b>Sub Urban</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_URBAN_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_URBAN(12, "subUrban", "subUrban"),

	/**
	 * The '<em><b>Night Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	NIGHT_TRAIN(13, "nightTrain", "nightTrain"),

	/**
	 * The '<em><b>Motor Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOR_RAIL(14, "motorRail", "motorRail"),

	/**
	 * The '<em><b>Mountain Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	MOUNTAIN_TRAIN(15, "mountainTrain", "mountainTrain"),

	/**
	 * The '<em><b>Historic Train</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIC_TRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORIC_TRAIN(16, "historicTrain", "historicTrain"),

	/**
	 * The '<em><b>Plane</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANE_VALUE
	 * @generated
	 * @ordered
	 */
	PLANE(3, "plane", "plane"),

	/**
	 * The '<em><b>Coach Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	COACH_GROUP(31, "coachGroup", "coachGroup"),

	/**
	 * The '<em><b>Shared Taxi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_TAXI_VALUE
	 * @generated
	 * @ordered
	 */
	SHARED_TAXI(34, "sharedTaxi", "sharedTaxi"),

	/**
	 * The '<em><b>Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(35, "tram", "tram"),

	/**
	 * The '<em><b>Under Ground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_GROUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDER_GROUND(36, "underGround", "underGround");

	/**
	 * The '<em><b>Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIN
	 * @model name="train"
	 * @generated
	 * @ordered
	 */
	public static final int TRAIN_VALUE = 37;

	/**
	 * The '<em><b>Ship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP
	 * @model name="ship"
	 * @generated
	 * @ordered
	 */
	public static final int SHIP_VALUE = 33;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 32;

	/**
	 * The '<em><b>High Speed Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_SPEED_TRAIN
	 * @model name="highSpeedTrain"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_SPEED_TRAIN_VALUE = 8;

	/**
	 * The '<em><b>Intercity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERCITY
	 * @model name="intercity"
	 * @generated
	 * @ordered
	 */
	public static final int INTERCITY_VALUE = 9;

	/**
	 * The '<em><b>Inter Regional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTER_REGIONAL
	 * @model name="interRegional"
	 * @generated
	 * @ordered
	 */
	public static final int INTER_REGIONAL_VALUE = 10;

	/**
	 * The '<em><b>Regional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL
	 * @model name="regional"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_VALUE = 11;

	/**
	 * The '<em><b>Sub Urban</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_URBAN
	 * @model name="subUrban"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_URBAN_VALUE = 12;

	/**
	 * The '<em><b>Night Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NIGHT_TRAIN
	 * @model name="nightTrain"
	 * @generated
	 * @ordered
	 */
	public static final int NIGHT_TRAIN_VALUE = 13;

	/**
	 * The '<em><b>Motor Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOR_RAIL
	 * @model name="motorRail"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOR_RAIL_VALUE = 14;

	/**
	 * The '<em><b>Mountain Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUNTAIN_TRAIN
	 * @model name="mountainTrain"
	 * @generated
	 * @ordered
	 */
	public static final int MOUNTAIN_TRAIN_VALUE = 15;

	/**
	 * The '<em><b>Historic Train</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORIC_TRAIN
	 * @model name="historicTrain"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORIC_TRAIN_VALUE = 16;

	/**
	 * The '<em><b>Plane</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANE
	 * @model name="plane"
	 * @generated
	 * @ordered
	 */
	public static final int PLANE_VALUE = 3;

	/**
	 * The '<em><b>Coach Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_GROUP
	 * @model name="coachGroup"
	 * @generated
	 * @ordered
	 */
	public static final int COACH_GROUP_VALUE = 31;

	/**
	 * The '<em><b>Shared Taxi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARED_TAXI
	 * @model name="sharedTaxi"
	 * @generated
	 * @ordered
	 */
	public static final int SHARED_TAXI_VALUE = 34;

	/**
	 * The '<em><b>Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model name="tram"
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 35;

	/**
	 * The '<em><b>Under Ground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_GROUND
	 * @model name="underGround"
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_GROUND_VALUE = 36;

	/**
	 * An array of all the '<em><b>Transport Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransportMode[] VALUES_ARRAY =
		new TransportMode[] {
			TRAIN,
			SHIP,
			BUS,
			HIGH_SPEED_TRAIN,
			INTERCITY,
			INTER_REGIONAL,
			REGIONAL,
			SUB_URBAN,
			NIGHT_TRAIN,
			MOTOR_RAIL,
			MOUNTAIN_TRAIN,
			HISTORIC_TRAIN,
			PLANE,
			COACH_GROUP,
			SHARED_TAXI,
			TRAM,
			UNDER_GROUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Transport Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransportMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportMode get(int value) {
		switch (value) {
			case TRAIN_VALUE: return TRAIN;
			case SHIP_VALUE: return SHIP;
			case BUS_VALUE: return BUS;
			case HIGH_SPEED_TRAIN_VALUE: return HIGH_SPEED_TRAIN;
			case INTERCITY_VALUE: return INTERCITY;
			case INTER_REGIONAL_VALUE: return INTER_REGIONAL;
			case REGIONAL_VALUE: return REGIONAL;
			case SUB_URBAN_VALUE: return SUB_URBAN;
			case NIGHT_TRAIN_VALUE: return NIGHT_TRAIN;
			case MOTOR_RAIL_VALUE: return MOTOR_RAIL;
			case MOUNTAIN_TRAIN_VALUE: return MOUNTAIN_TRAIN;
			case HISTORIC_TRAIN_VALUE: return HISTORIC_TRAIN;
			case PLANE_VALUE: return PLANE;
			case COACH_GROUP_VALUE: return COACH_GROUP;
			case SHARED_TAXI_VALUE: return SHARED_TAXI;
			case TRAM_VALUE: return TRAM;
			case UNDER_GROUND_VALUE: return UNDER_GROUND;
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
	private TransportMode(int value, String name, String literal) {
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
	
} //TransportMode
