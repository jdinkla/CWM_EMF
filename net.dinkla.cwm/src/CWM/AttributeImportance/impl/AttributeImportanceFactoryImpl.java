/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.AttributeImportance.impl;

import CWM.AttributeImportance.*;

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
public class AttributeImportanceFactoryImpl extends EFactoryImpl implements AttributeImportanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeImportanceFactory init() {
		try {
			AttributeImportanceFactory theAttributeImportanceFactory = (AttributeImportanceFactory)EPackage.Registry.INSTANCE.getEFactory("AttributeImportance"); 
			if (theAttributeImportanceFactory != null) {
				return theAttributeImportanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributeImportanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportanceFactoryImpl() {
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
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_SETTINGS: return createAttributeImportanceSettings();
			case AttributeImportancePackage.ATTRIBUTE_IMPORTANCE_CONTAINER: return createAttributeImportance_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportanceSettings createAttributeImportanceSettings() {
		AttributeImportanceSettingsImpl attributeImportanceSettings = new AttributeImportanceSettingsImpl();
		return attributeImportanceSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportance_container createAttributeImportance_container() {
		AttributeImportance_containerImpl attributeImportance_container = new AttributeImportance_containerImpl();
		return attributeImportance_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeImportancePackage getAttributeImportancePackage() {
		return (AttributeImportancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttributeImportancePackage getPackage() {
		return AttributeImportancePackage.eINSTANCE;
	}

} //AttributeImportanceFactoryImpl
