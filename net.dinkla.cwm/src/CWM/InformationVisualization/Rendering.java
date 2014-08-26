/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import CWM.Core.Feature;

import CWM.Expressions.ExpressionNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.Rendering#getFormula <em>Formula</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getAction <em>Action</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getFileName <em>File Name</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getType <em>Type</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getUrl <em>Url</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getRenderedObject <em>Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getDefaultedRenderedObject <em>Defaulted Rendered Object</em>}</li>
 *   <li>{@link CWM.InformationVisualization.Rendering#getRenderedObjectSet <em>Rendered Object Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering()
 * @model
 * @generated
 */
public interface Rendering extends Feature {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(ExpressionNode)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_Formula()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExpressionNode getFormula();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(ExpressionNode value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_Action()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_FileName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_Type()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_Url()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Rendered Object</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_RenderedObject()
	 * @see CWM.InformationVisualization.RenderedObject#getRendering
	 * @model opposite="rendering" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getRenderedObject();

	/**
	 * Returns the value of the '<em><b>Defaulted Rendered Object</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getDefaultRendering <em>Default Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defaulted Rendered Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaulted Rendered Object</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_DefaultedRenderedObject()
	 * @see CWM.InformationVisualization.RenderedObject#getDefaultRendering
	 * @model opposite="defaultRendering" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getDefaultedRenderedObject();

	/**
	 * Returns the value of the '<em><b>Rendered Object Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObjectSet#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object Set</em>' container reference.
	 * @see #setRenderedObjectSet(RenderedObjectSet)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRendering_RenderedObjectSet()
	 * @see CWM.InformationVisualization.RenderedObjectSet#getRendering
	 * @model opposite="rendering" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RenderedObjectSet getRenderedObjectSet();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.Rendering#getRenderedObjectSet <em>Rendered Object Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendered Object Set</em>' container reference.
	 * @see #getRenderedObjectSet()
	 * @generated
	 */
	void setRenderedObjectSet(RenderedObjectSet value);

} // Rendering
