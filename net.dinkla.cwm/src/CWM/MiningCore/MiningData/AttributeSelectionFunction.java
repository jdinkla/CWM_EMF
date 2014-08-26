/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attribute Selection Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getAttributeSelectionFunction()
 * @model
 * @generated
 */
public enum AttributeSelectionFunction implements Enumerator {
	/**
	 * The '<em><b>Is Not Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NOT_NULL(1, "isNotNull", "isNotNull"),

	/**
	 * The '<em><b>Is Null</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NULL(2, "isNull", "isNull"),

	/**
	 * The '<em><b>Is One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ONE(3, "isOne", "isOne"),

	/**
	 * The '<em><b>Is Zero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	IS_ZERO(4, "isZero", "isZero"),

	/**
	 * The '<em><b>Is True</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_TRUE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_TRUE(5, "isTrue", "isTrue"),

	/**
	 * The '<em><b>Is False</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	IS_FALSE(6, "isFalse", "isFalse");

	/**
	 * The '<em><b>Is Not Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Not Null</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NOT_NULL
	 * @model name="isNotNull"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NOT_NULL_VALUE = 1;

	/**
	 * The '<em><b>Is Null</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Null</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NULL
	 * @model name="isNull"
	 * @generated
	 * @ordered
	 */
	public static final int IS_NULL_VALUE = 2;

	/**
	 * The '<em><b>Is One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_ONE
	 * @model name="isOne"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ONE_VALUE = 3;

	/**
	 * The '<em><b>Is Zero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is Zero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_ZERO
	 * @model name="isZero"
	 * @generated
	 * @ordered
	 */
	public static final int IS_ZERO_VALUE = 4;

	/**
	 * The '<em><b>Is True</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is True</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_TRUE
	 * @model name="isTrue"
	 * @generated
	 * @ordered
	 */
	public static final int IS_TRUE_VALUE = 5;

	/**
	 * The '<em><b>Is False</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is False</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_FALSE
	 * @model name="isFalse"
	 * @generated
	 * @ordered
	 */
	public static final int IS_FALSE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Attribute Selection Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AttributeSelectionFunction[] VALUES_ARRAY =
		new AttributeSelectionFunction[] {
			IS_NOT_NULL,
			IS_NULL,
			IS_ONE,
			IS_ZERO,
			IS_TRUE,
			IS_FALSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Attribute Selection Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AttributeSelectionFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attribute Selection Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeSelectionFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeSelectionFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Selection Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeSelectionFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AttributeSelectionFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attribute Selection Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeSelectionFunction get(int value) {
		switch (value) {
			case IS_NOT_NULL_VALUE: return IS_NOT_NULL;
			case IS_NULL_VALUE: return IS_NULL;
			case IS_ONE_VALUE: return IS_ONE;
			case IS_ZERO_VALUE: return IS_ZERO;
			case IS_TRUE_VALUE: return IS_TRUE;
			case IS_FALSE_VALUE: return IS_FALSE;
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
	private AttributeSelectionFunction(int value, String name, String literal) {
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
	
} //AttributeSelectionFunction
