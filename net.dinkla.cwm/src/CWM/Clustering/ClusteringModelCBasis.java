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
 * A representation of the literals of the enumeration '<em><b>Model CBasis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringPackage#getClusteringModelCBasis()
 * @model
 * @generated
 */
public enum ClusteringModelCBasis implements Enumerator {
	/**
	 * The '<em><b>Center Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER_BASED(1, "centerBased", "centerBased"),

	/**
	 * The '<em><b>Probability Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	PROBABILITY_BASED(2, "probabilityBased", "probabilityBased"),

	/**
	 * The '<em><b>Partition Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTITION_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTITION_BASED(3, "partitionBased", "partitionBased"),

	/**
	 * The '<em><b>Aggregation Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION_BASED(4, "aggregationBased", "aggregationBased");

	/**
	 * The '<em><b>Center Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Center Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER_BASED
	 * @model name="centerBased"
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_BASED_VALUE = 1;

	/**
	 * The '<em><b>Probability Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Probability Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROBABILITY_BASED
	 * @model name="probabilityBased"
	 * @generated
	 * @ordered
	 */
	public static final int PROBABILITY_BASED_VALUE = 2;

	/**
	 * The '<em><b>Partition Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Partition Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTITION_BASED
	 * @model name="partitionBased"
	 * @generated
	 * @ordered
	 */
	public static final int PARTITION_BASED_VALUE = 3;

	/**
	 * The '<em><b>Aggregation Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGREGATION_BASED
	 * @model name="aggregationBased"
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_BASED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Model CBasis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClusteringModelCBasis[] VALUES_ARRAY =
		new ClusteringModelCBasis[] {
			CENTER_BASED,
			PROBABILITY_BASED,
			PARTITION_BASED,
			AGGREGATION_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Model CBasis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClusteringModelCBasis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model CBasis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClusteringModelCBasis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusteringModelCBasis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model CBasis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClusteringModelCBasis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClusteringModelCBasis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model CBasis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClusteringModelCBasis get(int value) {
		switch (value) {
			case CENTER_BASED_VALUE: return CENTER_BASED;
			case PROBABILITY_BASED_VALUE: return PROBABILITY_BASED;
			case PARTITION_BASED_VALUE: return PARTITION_BASED;
			case AGGREGATION_BASED_VALUE: return AGGREGATION_BASED;
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
	private ClusteringModelCBasis(int value, String name, String literal) {
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
	
} //ClusteringModelCBasis
