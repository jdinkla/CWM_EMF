/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Visualization container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.InformationVisualization_container#getRenderedObject <em>Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.InformationVisualization_container#getRenderedObjectSet <em>Rendered Object Set</em>}</li>
 *   <li>{@link CWM.InformationVisualization.InformationVisualization_container#getRendering <em>Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.InformationVisualization_container#getXSLRendering <em>XSL Rendering</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.InformationVisualization.InformationVisualizationPackage#getInformationVisualization_container()
 * @model
 * @generated
 */
public interface InformationVisualization_container extends EObject {
	/**
	 * Returns the value of the '<em><b>Rendered Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getInformationVisualization_container_RenderedObject()
	 * @model containment="true"
	 * @generated
	 */
	EList<RenderedObject> getRenderedObject();

	/**
	 * Returns the value of the '<em><b>Rendered Object Set</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObjectSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object Set</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getInformationVisualization_container_RenderedObjectSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RenderedObjectSet> getRenderedObjectSet();

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.Rendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getInformationVisualization_container_Rendering()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rendering> getRendering();

	/**
	 * Returns the value of the '<em><b>XSL Rendering</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.XSLRendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSL Rendering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSL Rendering</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getInformationVisualization_container_XSLRendering()
	 * @model containment="true"
	 * @generated
	 */
	EList<XSLRendering> getXSLRendering();

} // InformationVisualization_container
