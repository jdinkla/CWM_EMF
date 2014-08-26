/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.BusinessNomenclature.tests;

import CWM.BusinessNomenclature.BusinessDomain;
import CWM.BusinessNomenclature.BusinessNomenclatureFactory;

import CWM.Core.tests.PackageTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Domain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessDomainTest extends PackageTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessDomainTest.class);
	}

	/**
	 * Constructs a new Business Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessDomain getFixture() {
		return (BusinessDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BusinessNomenclatureFactory.eINSTANCE.createBusinessDomain());
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

} //BusinessDomainTest
