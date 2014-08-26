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
 * A representation of the literals of the enumeration '<em><b>Matrix Property</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningData.MiningDataPackage#getMatrixProperty()
 * @model
 * @generated
 */
public enum MatrixProperty implements Enumerator {
	/**
	 * The '<em><b>Mp symmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP_SYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	MP_SYMMETRIC(1, "mp_symmetric", "mp_symmetric"),

	/**
	 * The '<em><b>Mp diagonal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP_DIAGONAL_VALUE
	 * @generated
	 * @ordered
	 */
	MP_DIAGONAL(2, "mp_diagonal", "mp_diagonal"),

	/**
	 * The '<em><b>Mp any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP_ANY_VALUE
	 * @generated
	 * @ordered
	 */
	MP_ANY(3, "mp_any", "mp_any");

	/**
	 * The '<em><b>Mp symmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp symmetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP_SYMMETRIC
	 * @model name="mp_symmetric"
	 * @generated
	 * @ordered
	 */
	public static final int MP_SYMMETRIC_VALUE = 1;

	/**
	 * The '<em><b>Mp diagonal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp diagonal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP_DIAGONAL
	 * @model name="mp_diagonal"
	 * @generated
	 * @ordered
	 */
	public static final int MP_DIAGONAL_VALUE = 2;

	/**
	 * The '<em><b>Mp any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP_ANY
	 * @model name="mp_any"
	 * @generated
	 * @ordered
	 */
	public static final int MP_ANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Matrix Property</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MatrixProperty[] VALUES_ARRAY =
		new MatrixProperty[] {
			MP_SYMMETRIC,
			MP_DIAGONAL,
			MP_ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Matrix Property</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MatrixProperty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Matrix Property</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixProperty get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatrixProperty result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Matrix Property</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixProperty getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MatrixProperty result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Matrix Property</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MatrixProperty get(int value) {
		switch (value) {
			case MP_SYMMETRIC_VALUE: return MP_SYMMETRIC;
			case MP_DIAGONAL_VALUE: return MP_DIAGONAL;
			case MP_ANY_VALUE: return MP_ANY;
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
	private MatrixProperty(int value, String name, String literal) {
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
	
} //MatrixProperty
