/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.tests;

import CWM.Relational.RelationalFactory;
import CWM.Relational.SQLSimpleType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SQL Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLSimpleTypeTest extends SQLDataTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SQLSimpleTypeTest.class);
	}

	/**
	 * Constructs a new SQL Simple Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLSimpleTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SQL Simple Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SQLSimpleType getFixture() {
		return (SQLSimpleType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalFactory.eINSTANCE.createSQLSimpleType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SQLSimpleTypeTest
