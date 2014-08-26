/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.tests;

import CWM.Clustering.ClusteringAttributeUsage;
import CWM.Clustering.ClusteringFactory;

import CWM.MiningCore.MiningData.tests.AttributeUsageTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusteringAttributeUsageTest extends AttributeUsageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusteringAttributeUsageTest.class);
	}

	/**
	 * Constructs a new Attribute Usage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringAttributeUsageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Usage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClusteringAttributeUsage getFixture() {
		return (ClusteringAttributeUsage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClusteringFactory.eINSTANCE.createClusteringAttributeUsage());
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

} //ClusteringAttributeUsageTest
