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
 * A representation of the literals of the enumeration '<em><b>Value Selection Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getValueSelectionFunction()
 * @model
 * @generated
 */
public enum ValueSelectionFunction implements Enumerator {
	/**
	 * The '<em><b>Vsf value</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSF_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	VSF_VALUE(1, "vsf_value", "vsf_value"),

	/**
	 * The '<em><b>Vsf attribute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSF_ATTRIBUTE_VALUE
	 * @generated
	 * @ordered
	 */
	VSF_ATTRIBUTE(2, "vsf_attribute", "vsf_attribute");

	/**
	 * The '<em><b>Vsf value</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vsf value</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VSF_VALUE
	 * @model name="vsf_value"
	 * @generated
	 * @ordered
	 */
	public static final int VSF_VALUE_VALUE = 1;

	/**
	 * The '<em><b>Vsf attribute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vsf attribute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VSF_ATTRIBUTE
	 * @model name="vsf_attribute"
	 * @generated
	 * @ordered
	 */
	public static final int VSF_ATTRIBUTE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Value Selection Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValueSelectionFunction[] VALUES_ARRAY =
		new ValueSelectionFunction[] {
			VSF_VALUE,
			VSF_ATTRIBUTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Value Selection Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValueSelectionFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Value Selection Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueSelectionFunction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueSelectionFunction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Selection Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueSelectionFunction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValueSelectionFunction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Value Selection Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValueSelectionFunction get(int value) {
		switch (value) {
			case VSF_VALUE_VALUE: return VSF_VALUE;
			case VSF_ATTRIBUTE_VALUE: return VSF_ATTRIBUTE;
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
	private ValueSelectionFunction(int value, String name, String literal) {
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
	
} //ValueSelectionFunction
