/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.InformationVisualization;

import CWM.Core.Classifier;
import CWM.Core.ModelElement;

import CWM.Expressions.ExpressionNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendered Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getFormula <em>Formula</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getAction <em>Action</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getFileName <em>File Name</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getType <em>Type</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getUrl <em>Url</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getRendering <em>Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getDefaultRendering <em>Default Rendering</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getComponent <em>Component</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getComposite <em>Composite</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getNeighbor <em>Neighbor</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getReferencingNeighbor <em>Referencing Neighbor</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link CWM.InformationVisualization.RenderedObject#getRenderedObjectSet <em>Rendered Object Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject()
 * @model
 * @generated
 */
public interface RenderedObject extends Classifier {
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
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Formula()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ExpressionNode getFormula();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getFormula <em>Formula</em>}' containment reference.
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
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Action()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getAction <em>Action</em>}' attribute.
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
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_FileName()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getFileName <em>File Name</em>}' attribute.
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
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Type()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getType <em>Type</em>}' attribute.
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
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Url()
	 * @model unique="false" dataType="CWM.Core.String" required="true" ordered="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.Rendering}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.Rendering#getRenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Rendering()
	 * @see CWM.InformationVisualization.Rendering#getRenderedObject
	 * @model opposite="renderedObject" ordered="false"
	 * @generated
	 */
	EList<Rendering> getRendering();

	/**
	 * Returns the value of the '<em><b>Default Rendering</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.Rendering#getDefaultedRenderedObject <em>Defaulted Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Rendering</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Rendering</em>' reference.
	 * @see #setDefaultRendering(Rendering)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_DefaultRendering()
	 * @see CWM.InformationVisualization.Rendering#getDefaultedRenderedObject
	 * @model opposite="defaultedRenderedObject" ordered="false"
	 * @generated
	 */
	Rendering getDefaultRendering();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getDefaultRendering <em>Default Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Rendering</em>' reference.
	 * @see #getDefaultRendering()
	 * @generated
	 */
	void setDefaultRendering(Rendering value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Component()
	 * @see CWM.InformationVisualization.RenderedObject#getComposite
	 * @model opposite="composite" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getComponent();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Composite()
	 * @see CWM.InformationVisualization.RenderedObject#getComponent
	 * @model opposite="component" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getComposite();

	/**
	 * Returns the value of the '<em><b>Neighbor</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getReferencingNeighbor <em>Referencing Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbor</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_Neighbor()
	 * @see CWM.InformationVisualization.RenderedObject#getReferencingNeighbor
	 * @model opposite="referencingNeighbor" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getNeighbor();

	/**
	 * Returns the value of the '<em><b>Referencing Neighbor</b></em>' reference list.
	 * The list contents are of type {@link CWM.InformationVisualization.RenderedObject}.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObject#getNeighbor <em>Neighbor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencing Neighbor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencing Neighbor</em>' reference list.
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_ReferencingNeighbor()
	 * @see CWM.InformationVisualization.RenderedObject#getNeighbor
	 * @model opposite="neighbor" ordered="false"
	 * @generated
	 */
	EList<RenderedObject> getReferencingNeighbor();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(ModelElement)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_ModelElement()
	 * @model ordered="false"
	 * @generated
	 */
	ModelElement getModelElement();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Rendered Object Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.InformationVisualization.RenderedObjectSet#getRenderedObject <em>Rendered Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendered Object Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendered Object Set</em>' container reference.
	 * @see #setRenderedObjectSet(RenderedObjectSet)
	 * @see CWM.InformationVisualization.InformationVisualizationPackage#getRenderedObject_RenderedObjectSet()
	 * @see CWM.InformationVisualization.RenderedObjectSet#getRenderedObject
	 * @model opposite="renderedObject" required="true" transient="false" ordered="false"
	 * @generated
	 */
	RenderedObjectSet getRenderedObjectSet();

	/**
	 * Sets the value of the '{@link CWM.InformationVisualization.RenderedObject#getRenderedObjectSet <em>Rendered Object Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendered Object Set</em>' container reference.
	 * @see #getRenderedObjectSet()
	 * @generated
	 */
	void setRenderedObjectSet(RenderedObjectSet value);

} // RenderedObject
