/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.MiningCore.MiningData.tests;

import CWM.Core.tests.ModelElementTest;

import CWM.MiningCore.MiningData.CategoryTaxonomy;
import CWM.MiningCore.MiningData.MiningDataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Category Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryTaxonomyTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CategoryTaxonomyTest.class);
	}

	/**
	 * Constructs a new Category Taxonomy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryTaxonomyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Category Taxonomy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CategoryTaxonomy getFixture() {
		return (CategoryTaxonomy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MiningDataFactory.eINSTANCE.createCategoryTaxonomy());
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

} //CategoryTaxonomyTest
