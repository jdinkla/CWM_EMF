/*
	Copyright (C) 2007 Joern Dinkla, www.dinkla.net, joern@dinkla.net

	This program is free software; you can redistribute it and/or
	modify it under the terms of the GNU General Public License
	as published by the Free Software Foundation; either version 2
	of the License, or (at your option) any later version.

	This program is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	GNU General Public License for more details.

	You should have received a copy of the GNU General Public License
	along with this program; if not, write to the Free Software
	Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
*/
package net.dinkla.mof2ecore;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * @author Joern Dinkla, www.dinkla.net
 * 
 * <code>
 * usage: mof2ecore
 * -container    The suffix for the ecore containers
 * -debug
 * -input        The MOF/XML file to be processed
 * -output       The ecore/XMI file to be created
 * -package      The name of the toplevel package
 * -xslt         The XSLT file to use
 * </code>
 * 
 */
public class MOF2Ecore {

	/**
	 * The default file of the XSLT transformation.
	 */
	protected final static String xsltFileDefault = "xslts/mof2ecore_14.xslt";

	/**
	 * The default name of the package.
	 */
	protected final static String namePackageDefault = "Default";

	/**
	 * The default suffix of a container package.
	 */
	protected final static String suffixContainerDefault = "_container";

	/**
	 * The name of the XSLT file.
	 */
	protected static String xsltFile;

	/**
	 * The name of the input file.
	 */
	protected static String inputFile;

	/**
	 * The name of the output file.
	 */
	protected static String outputFile;

	/**
	 * The name of the package.
	 */
	protected static String namePackage;

	/**
	 * The suffix for the containers.
	 */
	protected static String suffixContainer;

	/**
	 * The debug flag.
	 */
	protected static boolean debug = false;

	/**
	 * The main method.
	 * 
	 * @param args		Command line arguments.
	 * 
	 */
	public static void main(String[] args) {

		// create the options
		Options options = new Options();
		options.addOption("input", true, "The MOF/XML file to be processed");
		options.addOption("output", true, "The ecore/XMI file to be created");
		options.addOption("xslt", true, "The XSLT file to use");
		options.addOption("package", true, "The name of the toplevel package");
		options.addOption("container", true, "The suffix for the ecore containers");
		options.addOption(new Option("debug", ""));

		// create the parser
		CommandLineParser parser = new GnuParser();
		HelpFormatter formatter = new HelpFormatter();
		try {
			// parse the command line arguments
			CommandLine line = parser.parse(options, args);

			inputFile = line.getOptionValue("input");
			outputFile = line.getOptionValue("output");
			xsltFile = line.getOptionValue("xslt");
			if (null == xsltFile) {
				xsltFile = xsltFileDefault;
			}
			namePackage = line.getOptionValue("package");
			if (null == namePackage) {
				namePackage = namePackageDefault;
			}
			suffixContainer = line.getOptionValue("container");
			if (null == suffixContainer) {
				suffixContainer = suffixContainerDefault;
			}
			debug = line.hasOption("debug");

			if (null == inputFile) {
				System.err.println("ERROR: the input file has to be specified.");
				formatter.printHelp( "mof2ecore", options );
			} else if (null == outputFile) {
				System.err.println("ERROR: the output file has to be specified.");
				formatter.printHelp( "mof2ecore", options );
			} else if (null == xsltFile) {
				System.err.println("ERROR: the XSLT file has to be specified.");
				formatter.printHelp( "mof2ecore", options );
			} else {
				if (debug) {
					System.out.println("Command line options:");
					System.out.println("input=" + inputFile);
					System.out.println("output=" + outputFile);
					System.out.println("xslt=" + xsltFile);
					System.out.println("package=" + namePackage);
					System.out.println("container=" + suffixContainer);
					System.out.println("");
				}
				mof2ecore(xsltFile, inputFile, outputFile);
			}
		} catch (ParseException exp) {
			System.err.println("Parsing failed.  Reason: " + exp.getMessage());
			formatter.printHelp( "mof2ecore", options );
		}
	}

	/**
	 * 
	 * @param fileXSL
	 * @param fileInput
	 * @param fileOutput
	 */
	public static void mof2ecore(String fileXSL, String fileInput, String fileOutput) {
		TransformerFactory tFactory = TransformerFactory.newInstance();
		try {
			System.out.println("Processing " + fileInput);
			Transformer transformer = tFactory.newTransformer(new StreamSource(fileXSL));
			transformer.setParameter("ecore_toplevel_package", namePackage);
			transformer.setParameter("ecore_container_suffix", suffixContainer);

			// TODO remove broken files and throw error
			transformer.transform(new StreamSource(fileInput), new StreamResult(new FileOutputStream(fileOutput)));
			System.out.println("Finished processing " + fileInput);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

}
