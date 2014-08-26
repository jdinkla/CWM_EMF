/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mining Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningModel.MiningModelPackage#getMiningFunction()
 * @model
 * @generated
 */
public enum MiningFunction implements Enumerator {
	/**
	 * The '<em><b>Classification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	CLASSIFICATION(1, "classification", "classification"),

	/**
	 * The '<em><b>Regression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	REGRESSION(2, "regression", "regression"),

	/**
	 * The '<em><b>Clustering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTERING(3, "clustering", "clustering"),

	/**
	 * The '<em><b>Association Rules</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_RULES_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION_RULES(4, "associationRules", "associationRules"),

	/**
	 * The '<em><b>Attribute Importance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_IMPORTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE_IMPORTANCE(5, "attributeImportance", "attributeImportance"),

	/**
	 * The '<em><b>Sequence Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE_ANALYSIS(6, "sequenceAnalysis", "sequenceAnalysis");

	/**
	 * The '<em><b>Classification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Classification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASSIFICATION
	 * @model name="classification"
	 * @generated
	 * @ordered
	 */
	public static final int CLASSIFICATION_VALUE = 1;

	/**
	 * The '<em><b>Regression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGRESSION
	 * @model name="regression"
	 * @generated
	 * @ordered
	 */
	public static final int REGRESSION_VALUE = 2;

	/**
	 * The '<em><b>Clustering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clustering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLUSTERING
	 * @model name="clustering"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTERING_VALUE = 3;

	/**
	 * The '<em><b>Association Rules</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Association Rules</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_RULES
	 * @model name="associationRules"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_RULES_VALUE = 4;

	/**
	 * The '<em><b>Attribute Importance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attribute Importance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_IMPORTANCE
	 * @model name="attributeImportance"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_IMPORTANCE_VALUE = 5;

	/**
	 * The '<em><b>Sequence Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequence Analysis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_ANALYSIS
	 * @model name="sequenceAnalysis"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_ANALYSIS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Mining Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MiningFunction[] VALUES_ARRAY =
		new MiningFunction[] {
			CLASSIFICATION,
			REGRESSION,
			CLUSTERING,
			ASSOCIATION_RULES,
			ATTRIBUTE_IMPORTANCE,
			SEQUENCE_ANALYSIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Mining Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MiningFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mining Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MiningFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mining Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MiningFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mining Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MiningFunction get(int value) {
		switch (value) {
			case CLASSIFICATION_VALUE: return CLASSIFICATION;
			case REGRESSION_VALUE: return REGRESSION;
			case CLUSTERING_VALUE: return CLUSTERING;
			case ASSOCIATION_RULES_VALUE: return ASSOCIATION_RULES;
			case ATTRIBUTE_IMPORTANCE_VALUE: return ATTRIBUTE_IMPORTANCE;
			case SEQUENCE_ANALYSIS_VALUE: return SEQUENCE_ANALYSIS;
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
	private MiningFunction(int value, String name, String literal) {
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
	
} //MiningFunction
