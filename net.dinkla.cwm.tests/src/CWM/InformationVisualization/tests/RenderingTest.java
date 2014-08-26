/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.tests;

import CWM.Core.tests.FeatureTest;

import CWM.InformationVisualization.InformationVisualizationFactory;
import CWM.InformationVisualization.Rendering;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenderingTest extends FeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenderingTest.class);
	}

	/**
	 * Constructs a new Rendering test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rendering test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Rendering getFixture() {
		return (Rendering)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationVisualizationFactory.eINSTANCE.createRendering());
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

} //RenderingTest
