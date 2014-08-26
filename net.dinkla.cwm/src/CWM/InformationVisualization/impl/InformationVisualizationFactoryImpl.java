/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization.impl;

import CWM.InformationVisualization.*;

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
public class InformationVisualizationFactoryImpl extends EFactoryImpl implements InformationVisualizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InformationVisualizationFactory init() {
		try {
			InformationVisualizationFactory theInformationVisualizationFactory = (InformationVisualizationFactory)EPackage.Registry.INSTANCE.getEFactory("InformationVisualization"); 
			if (theInformationVisualizationFactory != null) {
				return theInformationVisualizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InformationVisualizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationVisualizationFactoryImpl() {
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
			case InformationVisualizationPackage.RENDERED_OBJECT: return createRenderedObject();
			case InformationVisualizationPackage.RENDERED_OBJECT_SET: return createRenderedObjectSet();
			case InformationVisualizationPackage.RENDERING: return createRendering();
			case InformationVisualizationPackage.XSL_RENDERING: return createXSLRendering();
			case InformationVisualizationPackage.INFORMATION_VISUALIZATION_CONTAINER: return createInformationVisualization_container();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderedObject createRenderedObject() {
		RenderedObjectImpl renderedObject = new RenderedObjectImpl();
		return renderedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderedObjectSet createRenderedObjectSet() {
		RenderedObjectSetImpl renderedObjectSet = new RenderedObjectSetImpl();
		return renderedObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSLRendering createXSLRendering() {
		XSLRenderingImpl xslRendering = new XSLRenderingImpl();
		return xslRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationVisualization_container createInformationVisualization_container() {
		InformationVisualization_containerImpl informationVisualization_container = new InformationVisualization_containerImpl();
		return informationVisualization_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationVisualizationPackage getInformationVisualizationPackage() {
		return (InformationVisualizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InformationVisualizationPackage getPackage() {
		return InformationVisualizationPackage.eINSTANCE;
	}

} //InformationVisualizationFactoryImpl
