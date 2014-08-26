/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.tests;

import CWM.BusinessNomenclature.BusinessNomenclatureFactory;
import CWM.BusinessNomenclature.VocabularyElement;

import CWM.Core.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vocabulary Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VocabularyElementTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VocabularyElementTest.class);
	}

	/**
	 * Constructs a new Vocabulary Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vocabulary Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VocabularyElement getFixture() {
		return (VocabularyElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessNomenclatureFactory.eINSTANCE.createVocabularyElement());
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

} //VocabularyElementTest
