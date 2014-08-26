/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CWM.InformationVisualization.InformationVisualizationPackage
 * @generated
 */
public interface InformationVisualizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationVisualizationFactory eINSTANCE = CWM.InformationVisualization.impl.InformationVisualizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rendered Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendered Object</em>'.
	 * @generated
	 */
	RenderedObject createRenderedObject();

	/**
	 * Returns a new object of class '<em>Rendered Object Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendered Object Set</em>'.
	 * @generated
	 */
	RenderedObjectSet createRenderedObjectSet();

	/**
	 * Returns a new object of class '<em>Rendering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rendering</em>'.
	 * @generated
	 */
	Rendering createRendering();

	/**
	 * Returns a new object of class '<em>XSL Rendering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSL Rendering</em>'.
	 * @generated
	 */
	XSLRendering createXSLRendering();

	/**
	 * Returns a new object of class '<em>Information Visualization container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Visualization container</em>'.
	 * @generated
	 */
	InformationVisualization_container createInformationVisualization_container();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InformationVisualizationPackage getInformationVisualizationPackage();

} //InformationVisualizationFactory
