/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.KeysIndexes.impl;

import CWM.KeysIndexes.*;

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
public class KeysIndexesFactoryImpl extends EFactoryImpl implements KeysIndexesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KeysIndexesFactory init() {
		try {
			KeysIndexesFactory theKeysIndexesFactory = (KeysIndexesFactory)EPackage.Registry.INSTANCE.getEFactory("KeysIndexes"); 
			if (theKeysIndexesFactory != null) {
				return theKeysIndexesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KeysIndexesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysIndexesFactoryImpl() {
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
			case KeysIndexesPackage.UNIQUE_KEY: return createUniqueKey();
			case KeysIndexesPackage.INDEX: return createIndex();
			case KeysIndexesPackage.KEY_RELATIONSHIP: return createKeyRelationship();
			case KeysIndexesPackage.INDEXED_FEATURE: return createIndexedFeature();
			case KeysIndexesPackage.KEYS_INDEXES_CONTAINER: return createKeysIndexes_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueKey createUniqueKey() {
		UniqueKeyImpl uniqueKey = new UniqueKeyImpl();
		return uniqueKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyRelationship createKeyRelationship() {
		KeyRelationshipImpl keyRelationship = new KeyRelationshipImpl();
		return keyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedFeature createIndexedFeature() {
		IndexedFeatureImpl indexedFeature = new IndexedFeatureImpl();
		return indexedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysIndexes_container createKeysIndexes_container() {
		KeysIndexes_containerImpl keysIndexes_container = new KeysIndexes_containerImpl();
		return keysIndexes_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeysIndexesPackage getKeysIndexesPackage() {
		return (KeysIndexesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KeysIndexesPackage getPackage() {
		return KeysIndexesPackage.eINSTANCE;
	}

} //KeysIndexesFactoryImpl
