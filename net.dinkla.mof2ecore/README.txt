(c) 2007 Joern Dinkla, www.dinkla.net

This project contains the MOF2Ecore transformation program.

It is in a preliminary state. I used it to transform the CWM/MOF
model into an EMF Ecore model.

For developers:

The CWM Ecore model is in the folder generated/models/cwm.ecore
and its corresponding genmodel is generated/models/cwm.genmodel.

The class MOF2Ecore uses an XSLT-transformation.

1. Transform the CWM metamodel into an Ecore metamodel.

	usage: mof2ecore
	-container    The suffix for the ecore containers
	-debug
	-input        The MOF/XML file to be processed
	-output       The ecore/XMI file to be created
	-package      The name of the toplevel package
	-xslt         The XSLT file to use

	For example

	$ java -cp "bin/:lib/commons-cli-1.0.jar" net.dinkla.mof2ecore.MOF2Ecore -container _container -input mofmodels/cwm.xml -output test.ecore -package CWM -xslt xslts/mof2ecore_14.xslt

2. Create an EMF *.genmodel from the Ecore model created.

This step is not automated. You have to do it manually.

3. Generate the model and editor with the genmodel.

This step is not automated. You have to do it manually.

