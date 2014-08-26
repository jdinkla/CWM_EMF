/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Clustering.tests;

import CWM.Clustering.ClusteringFactory;
import CWM.Clustering.ClusteringFunctionSettings;

import CWM.MiningCore.MiningFunctionSettings.tests.MiningFunctionSettingsTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Settings</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClusteringFunctionSettingsTest extends MiningFunctionSettingsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClusteringFunctionSettingsTest.class);
	}

	/**
	 * Constructs a new Function Settings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusteringFunctionSettingsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Settings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClusteringFunctionSettings getFixture() {
		return (ClusteringFunctionSettings)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClusteringFactory.eINSTANCE.createClusteringFunctionSettings());
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

} //ClusteringFunctionSettingsTest
