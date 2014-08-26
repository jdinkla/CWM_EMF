/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Classification.tests;

import CWM.Classification.ClassificationFactory;
import CWM.Classification.PriorProbabilitiesEntry;

import CWM.Core.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prior Probabilities Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PriorProbabilitiesEntryTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PriorProbabilitiesEntryTest.class);
	}

	/**
	 * Constructs a new Prior Probabilities Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorProbabilitiesEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prior Probabilities Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PriorProbabilitiesEntry getFixture() {
		return (PriorProbabilitiesEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ClassificationFactory.eINSTANCE.createPriorProbabilitiesEntry());
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

} //PriorProbabilitiesEntryTest
