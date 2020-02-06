/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class Message {
	// ################################# ATTRIBUTS #################################
	
	// ################################ CONSTRUCTOR ################################
	
	// ############################## GETTER & SETTER ##############################
	
	// ################################## METHODS ##################################
	
	public void beginPolygon() {
		StrGenerate delimiter = new StrGenerate(StrGenerate.DELIM_EQUAL);
		ProgramMenu menu = new ProgramMenu(ProgramMenu.PROG_REG_POLY, delimiter.getDelimChar());
		String welcome = "Welcome to this program :";
		menu.menuHeader();
		System.out.println("\n".concat(welcome));
		System.out.println(delimiter.delimiterSimple(welcome.length()));
	}
	
	public void beginOrthonormal() {
		StrGenerate delimiter = new StrGenerate(StrGenerate.DELIM_EQUAL);
		ProgramMenu menu = new ProgramMenu(ProgramMenu.PROG_ORTHONORMAL, delimiter.getDelimChar());
		String welcome = "Welcome to this program :";
		menu.menuHeader();
		System.out.println("\n".concat(welcome));
		System.out.println(delimiter.delimiterSimple(welcome.length()));
	}
	
	public void enterElementA(String element) {
		System.out.println("\nPlease enter a ".concat(element).concat(" :"));
	}
	
	
}
