/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.tests;

import CWM.BusinessNomenclature.BusinessNomenclatureFactory;
import CWM.BusinessNomenclature.Taxonomy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxonomyTest extends NomenclatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaxonomyTest.class);
	}

	/**
	 * Constructs a new Taxonomy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxonomyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Taxonomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Taxonomy getFixture() {
		return (Taxonomy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessNomenclatureFactory.eINSTANCE.createTaxonomy());
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

} //TaxonomyTest
