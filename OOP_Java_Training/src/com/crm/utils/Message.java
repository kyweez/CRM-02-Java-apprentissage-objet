/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class Message {

	public void beginPolygon() {
		StrGenerate delimiter = new StrGenerate(StrGenerate.DELIM_EQUAL);
		ProgramMenu menu = new ProgramMenu(ProgramMenu.PROG_REG_POLY, delimiter.getDelimChar());
		String welcome = "Welcome to this program :";
		menu.menuHeader();
		System.out.println("\n".concat(welcome));
		System.out.println(delimiter.delimiterSimple(welcome.length()).concat("\n"));
			}
	
	
	
}
