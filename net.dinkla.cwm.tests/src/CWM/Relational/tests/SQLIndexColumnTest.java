/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Relational.tests;

import CWM.KeysIndexes.tests.IndexedFeatureTest;

import CWM.Relational.RelationalFactory;
import CWM.Relational.SQLIndexColumn;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SQL Index Column</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SQLIndexColumnTest extends IndexedFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SQLIndexColumnTest.class);
	}

	/**
	 * Constructs a new SQL Index Column test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLIndexColumnTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SQL Index Column test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SQLIndexColumn getFixture() {
		return (SQLIndexColumn)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RelationalFactory.eINSTANCE.createSQLIndexColumn());
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

} //SQLIndexColumnTest
