/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.tests;

import CWM.Core.tests.PackageTest;

import CWM.InformationVisualization.InformationVisualizationFactory;
import CWM.InformationVisualization.RenderedObjectSet;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rendered Object Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RenderedObjectSetTest extends PackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenderedObjectSetTest.class);
	}

	/**
	 * Constructs a new Rendered Object Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderedObjectSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rendered Object Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RenderedObjectSet getFixture() {
		return (RenderedObjectSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InformationVisualizationFactory.eINSTANCE.createRenderedObjectSet());
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

} //RenderedObjectSetTest
