/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.TypeMapping.impl;

import CWM.TypeMapping.*;

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
public class TypeMappingFactoryImpl extends EFactoryImpl implements TypeMappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeMappingFactory init() {
		try {
			TypeMappingFactory theTypeMappingFactory = (TypeMappingFactory)EPackage.Registry.INSTANCE.getEFactory("TypeMapping"); 
			if (theTypeMappingFactory != null) {
				return theTypeMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMappingFactoryImpl() {
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
			case TypeMappingPackage.TYPE_MAPPING: return createTypeMapping();
			case TypeMappingPackage.TYPE_SYSTEM: return createTypeSystem();
			case TypeMappingPackage.TYPE_MAPPING_CONTAINER: return createTypeMapping_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapping createTypeMapping() {
		TypeMappingImpl typeMapping = new TypeMappingImpl();
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSystem createTypeSystem() {
		TypeSystemImpl typeSystem = new TypeSystemImpl();
		return typeSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMapping_container createTypeMapping_container() {
		TypeMapping_containerImpl typeMapping_container = new TypeMapping_containerImpl();
		return typeMapping_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMappingPackage getTypeMappingPackage() {
		return (TypeMappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypeMappingPackage getPackage() {
		return TypeMappingPackage.eINSTANCE;
	}

} //TypeMappingFactoryImpl
