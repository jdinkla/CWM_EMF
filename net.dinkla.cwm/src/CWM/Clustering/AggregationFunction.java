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
 * A representation of the literals of the enumeration '<em><b>Aggregation Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.Clustering.ClusteringPackage#getAggregationFunction()
 * @model
 * @generated
 */
public enum AggregationFunction implements Enumerator {
	/**
	 * The '<em><b>Euclidean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN_VALUE
	 * @generated
	 * @ordered
	 */
	EUCLIDEAN(1, "euclidean", "euclidean"),

	/**
	 * The '<em><b>Squared Euclidean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARED_EUCLIDEAN_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARED_EUCLIDEAN(2, "squaredEuclidean", "squaredEuclidean"),

	/**
	 * The '<em><b>Chebychev</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEBYCHEV_VALUE
	 * @generated
	 * @ordered
	 */
	CHEBYCHEV(3, "chebychev", "chebychev"),

	/**
	 * The '<em><b>City Block</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CITY_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CITY_BLOCK(4, "cityBlock", "cityBlock"),

	/**
	 * The '<em><b>Minkovski</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINKOVSKI_VALUE
	 * @generated
	 * @ordered
	 */
	MINKOVSKI(5, "minkovski", "minkovski"),

	/**
	 * The '<em><b>Simple Matching</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_MATCHING_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_MATCHING(6, "simpleMatching", "simpleMatching"),

	/**
	 * The '<em><b>Jaccard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACCARD_VALUE
	 * @generated
	 * @ordered
	 */
	JACCARD(7, "jaccard", "jaccard"),

	/**
	 * The '<em><b>Tanimoto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANIMOTO_VALUE
	 * @generated
	 * @ordered
	 */
	TANIMOTO(8, "tanimoto", "tanimoto"),

	/**
	 * The '<em><b>Binary Similarity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_SIMILARITY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_SIMILARITY(9, "binarySimilarity", "binarySimilarity");

	/**
	 * The '<em><b>Euclidean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Euclidean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN
	 * @model name="euclidean"
	 * @generated
	 * @ordered
	 */
	public static final int EUCLIDEAN_VALUE = 1;

	/**
	 * The '<em><b>Squared Euclidean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Squared Euclidean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQUARED_EUCLIDEAN
	 * @model name="squaredEuclidean"
	 * @generated
	 * @ordered
	 */
	public static final int SQUARED_EUCLIDEAN_VALUE = 2;

	/**
	 * The '<em><b>Chebychev</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chebychev</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEBYCHEV
	 * @model name="chebychev"
	 * @generated
	 * @ordered
	 */
	public static final int CHEBYCHEV_VALUE = 3;

	/**
	 * The '<em><b>City Block</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>City Block</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CITY_BLOCK
	 * @model name="cityBlock"
	 * @generated
	 * @ordered
	 */
	public static final int CITY_BLOCK_VALUE = 4;

	/**
	 * The '<em><b>Minkovski</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minkovski</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINKOVSKI
	 * @model name="minkovski"
	 * @generated
	 * @ordered
	 */
	public static final int MINKOVSKI_VALUE = 5;

	/**
	 * The '<em><b>Simple Matching</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Matching</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_MATCHING
	 * @model name="simpleMatching"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_MATCHING_VALUE = 6;

	/**
	 * The '<em><b>Jaccard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jaccard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JACCARD
	 * @model name="jaccard"
	 * @generated
	 * @ordered
	 */
	public static final int JACCARD_VALUE = 7;

	/**
	 * The '<em><b>Tanimoto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tanimoto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TANIMOTO
	 * @model name="tanimoto"
	 * @generated
	 * @ordered
	 */
	public static final int TANIMOTO_VALUE = 8;

	/**
	 * The '<em><b>Binary Similarity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary Similarity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_SIMILARITY
	 * @model name="binarySimilarity"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_SIMILARITY_VALUE = 9;

	/**
	 * An array of all the '<em><b>Aggregation Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AggregationFunction[] VALUES_ARRAY =
		new AggregationFunction[] {
			EUCLIDEAN,
			SQUARED_EUCLIDEAN,
			CHEBYCHEV,
			CITY_BLOCK,
			MINKOVSKI,
			SIMPLE_MATCHING,
			JACCARD,
			TANIMOTO,
			BINARY_SIMILARITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Aggregation Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AggregationFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Aggregation Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregationFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregationFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AggregationFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Aggregation Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AggregationFunction get(int value) {
		switch (value) {
			case EUCLIDEAN_VALUE: return EUCLIDEAN;
			case SQUARED_EUCLIDEAN_VALUE: return SQUARED_EUCLIDEAN;
			case CHEBYCHEV_VALUE: return CHEBYCHEV;
			case CITY_BLOCK_VALUE: return CITY_BLOCK;
			case MINKOVSKI_VALUE: return MINKOVSKI;
			case SIMPLE_MATCHING_VALUE: return SIMPLE_MATCHING;
			case JACCARD_VALUE: return JACCARD;
			case TANIMOTO_VALUE: return TANIMOTO;
			case BINARY_SIMILARITY_VALUE: return BINARY_SIMILARITY;
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
	private AggregationFunction(int value, String name, String literal) {
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
	
} //AggregationFunction
