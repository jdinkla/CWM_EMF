/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Multidimensional.impl;

import CWM.Multidimensional.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultidimensionalFactoryImpl extends EFactoryImpl implements MultidimensionalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultidimensionalFactory init() {
		try {
			MultidimensionalFactory theMultidimensionalFactory = (MultidimensionalFactory)EPackage.Registry.INSTANCE.getEFactory("Multidimensional"); 
			if (theMultidimensionalFactory != null) {
				return theMultidimensionalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultidimensionalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultidimensionalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MultidimensionalPackage.DIMENSION: return createDimension();
			case MultidimensionalPackage.DIMENSIONED_OBJECT: return createDimensionedObject();
			case MultidimensionalPackage.MEMBER: return createMember();
			case MultidimensionalPackage.MEMBER_SET: return createMemberSet();
			case MultidimensionalPackage.MEMBER_VALUE: return createMemberValue();
			case MultidimensionalPackage.SCHEMA: return createSchema();
			case MultidimensionalPackage.MULTIDIMENSIONAL_CONTAINER: return createMultidimensional_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionedObject createDimensionedObject() {
		DimensionedObjectImpl dimensionedObject = new DimensionedObjectImpl();
		return dimensionedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberSet createMemberSet() {
		MemberSetImpl memberSet = new MemberSetImpl();
		return memberSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberValue createMemberValue() {
		MemberValueImpl memberValue = new MemberValueImpl();
		return memberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multidimensional_container createMultidimensional_container() {
		Multidimensional_containerImpl multidimensional_container = new Multidimensional_containerImpl();
		return multidimensional_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultidimensionalPackage getMultidimensionalPackage() {
		return (MultidimensionalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultidimensionalPackage getPackage() {
		return MultidimensionalPackage.eINSTANCE;
	}

} //MultidimensionalFactoryImpl
