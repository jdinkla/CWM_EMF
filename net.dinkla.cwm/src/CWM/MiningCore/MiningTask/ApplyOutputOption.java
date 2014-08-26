/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Apply Output Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CWM.MiningCore.MiningTask.MiningTaskPackage#getApplyOutputOption()
 * @model
 * @generated
 */
public enum ApplyOutputOption implements Enumerator {
	/**
	 * The '<em><b>Append To Existing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND_TO_EXISTING_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND_TO_EXISTING(1, "appendToExisting", "appendToExisting"),

	/**
	 * The '<em><b>Create New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_NEW_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_NEW(2, "createNew", "createNew");

	/**
	 * The '<em><b>Append To Existing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Append To Existing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPEND_TO_EXISTING
	 * @model name="appendToExisting"
	 * @generated
	 * @ordered
	 */
	public static final int APPEND_TO_EXISTING_VALUE = 1;

	/**
	 * The '<em><b>Create New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create New</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_NEW
	 * @model name="createNew"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_NEW_VALUE = 2;

	/**
	 * An array of all the '<em><b>Apply Output Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplyOutputOption[] VALUES_ARRAY =
		new ApplyOutputOption[] {
			APPEND_TO_EXISTING,
			CREATE_NEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Apply Output Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplyOutputOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Apply Output Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplyOutputOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplyOutputOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Apply Output Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplyOutputOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplyOutputOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Apply Output Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplyOutputOption get(int value) {
		switch (value) {
			case APPEND_TO_EXISTING_VALUE: return APPEND_TO_EXISTING;
			case CREATE_NEW_VALUE: return CREATE_NEW;
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
	private ApplyOutputOption(int value, String name, String literal) {
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
	
} //ApplyOutputOption
