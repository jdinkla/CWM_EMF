/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.tests;

import CWM.InformationVisualization.InformationVisualizationFactory;
import CWM.InformationVisualization.XSLRendering;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XSL Rendering</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XSLRenderingTest extends RenderingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XSLRenderingTest.class);
	}

	/**
	 * Constructs a new XSL Rendering test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLRenderingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XSL Rendering test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XSLRendering getFixture() {
		return (XSLRendering)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationVisualizationFactory.eINSTANCE.createXSLRendering());
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

} //XSLRenderingTest
