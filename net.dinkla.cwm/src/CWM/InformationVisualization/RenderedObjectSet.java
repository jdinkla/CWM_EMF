/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendered Object Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.RenderedObjectSet#getRenderedObject <em>Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObjectSet#getRendering <em>Rendering</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObjectSet()
 * @model
 * @generated
 */
public interface RenderedObjectSet extends CWM.Core.Package {
	/**
	 * Returns the value of the '<em><b>Rendered Object</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getRenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObjectSet_RenderedObject()
	 * @see CWM.InformationVisualization.RenderedObject#getRenderedObjectSet
	 * @model opposite="renderedObjectSet" containment="true" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getRenderedObject();

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.Rendering}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.Rendering#getRenderedObjectSet <em>Rendered Object Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' containment reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObjectSet_Rendering()
	 * @see CWM.InformationVisualization.Rendering#getRenderedObjectSet
	 * @model opposite="renderedObjectSet" containment="true" ordered="false"
	 * @generated
	 */
	EList<Rendering> getRendering();

} // RenderedObjectSet
