/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.tests;

import CWM.Core.tests.ClassifierTest;

import CWM.InformationVisualization.InformationVisualizationFactory;
import CWM.InformationVisualization.RenderedObject;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rendered Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenderedObjectTest extends ClassifierTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenderedObjectTest.class);
	}

	/**
	 * Constructs a new Rendered Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderedObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rendered Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RenderedObject getFixture() {
		return (RenderedObject)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationVisualizationFactory.eINSTANCE.createRenderedObject());
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

} //RenderedObjectTest
