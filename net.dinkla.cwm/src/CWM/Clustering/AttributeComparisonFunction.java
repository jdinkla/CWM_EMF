/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Comparison Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringPackage#getAttributeComparisonFunction()
 * @model
 * @generated
 */
public enum AttributeComparisonFunction implements Enumerator {
	/**
	 * The '<em><b>Abs Diff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_DIFF_VALUE
	 * @generated
	 * @ordered
	 */
	ABS_DIFF(1, "absDiff", "absDiff"),

	/**
	 * The '<em><b>Gauss Sim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSS_SIM_VALUE
	 * @generated
	 * @ordered
	 */
	GAUSS_SIM(2, "gaussSim", "gaussSim"),

	/**
	 * The '<em><b>Delta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELTA_VALUE
	 * @generated
	 * @ordered
	 */
	DELTA(3, "delta", "delta"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(4, "equal", "equal"),

	/**
	 * The '<em><b>Table</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(5, "table", "table");

	/**
	 * The '<em><b>Abs Diff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abs Diff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABS_DIFF
	 * @model name="absDiff"
	 * @generated
	 * @ordered
	 */
	public static final int ABS_DIFF_VALUE = 1;

	/**
	 * The '<em><b>Gauss Sim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gauss Sim</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAUSS_SIM
	 * @model name="gaussSim"
	 * @generated
	 * @ordered
	 */
	public static final int GAUSS_SIM_VALUE = 2;

	/**
	 * The '<em><b>Delta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELTA
	 * @model name="delta"
	 * @generated
	 * @ordered
	 */
	public static final int DELTA_VALUE = 3;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 4;

	/**
	 * The '<em><b>Table</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model name="table"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Attribute Comparison Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeComparisonFunction[] VALUES_ARRAY =
		new AttributeComparisonFunction[] {
			ABS_DIFF,
			GAUSS_SIM,
			DELTA,
			EQUAL,
			TABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Comparison Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeComparisonFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Comparison Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeComparisonFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeComparisonFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Comparison Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeComparisonFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeComparisonFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Comparison Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeComparisonFunction get(int value) {
		switch (value) {
			case ABS_DIFF_VALUE: return ABS_DIFF;
			case GAUSS_SIM_VALUE: return GAUSS_SIM;
			case DELTA_VALUE: return DELTA;
			case EQUAL_VALUE: return EQUAL;
			case TABLE_VALUE: return TABLE;
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
	private AttributeComparisonFunction(int value, String name, String literal) {
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
	
} //AttributeComparisonFunction
