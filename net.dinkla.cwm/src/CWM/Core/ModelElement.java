/**
 * (c) 2007 Joern Dinkla, www.dinkla.net
 * 
 *
 * $Id$
 */
package CWM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CWM.Core.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getImporter <em>Importer</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link CWM.Core.ModelElement#getTaggedValue <em>Tagged Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see CWM.Core.CorePackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CWM.Core.CorePackage#getModelElement_Name()
	 * @model unique="false" dataType="CWM.Core.Name" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CWM.Core.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link CWM.Core.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see CWM.Core.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see CWM.Core.CorePackage#getModelElement_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link CWM.Core.ModelElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see CWM.Core.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Dependency}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see CWM.Core.CorePackage#getModelElement_ClientDependency()
	 * @see CWM.Core.Dependency#getClient
	 * @model opposite="client" ordered="false"
	 * @generated
	 */
	EList<Dependency> getClientDependency();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Constraint}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Constraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see CWM.Core.CorePackage#getModelElement_Constraint()
	 * @see CWM.Core.Constraint#getConstrainedElement
	 * @model opposite="constrainedElement" ordered="false"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Importer</b></em>' reference list.
	 * The list contents are of type {@link CWM.Core.Package}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Package#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importer</em>' reference list.
	 * @see CWM.Core.CorePackage#getModelElement_Importer()
	 * @see CWM.Core.Package#getImportedElement
	 * @model opposite="importedElement" ordered="false"
	 * @generated
	 */
	EList<CWM.Core.Package> getImporter();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CWM.Core.Namespace#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(Namespace)
	 * @see CWM.Core.CorePackage#getModelElement_Namespace()
	 * @see CWM.Core.Namespace#getOwnedElement
	 * @model opposite="ownedElement" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link CWM.Core.ModelElement#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Tagged Value</b></em>' containment reference list.
	 * The list contents are of type {@link CWM.Core.TaggedValue}.
	 * It is bidirectional and its opposite is '{@link CWM.Core.TaggedValue#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Value</em>' containment reference list.
	 * @see CWM.Core.CorePackage#getModelElement_TaggedValue()
	 * @see CWM.Core.TaggedValue#getModelElement
	 * @model opposite="modelElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<TaggedValue> getTaggedValue();

} // ModelElement
