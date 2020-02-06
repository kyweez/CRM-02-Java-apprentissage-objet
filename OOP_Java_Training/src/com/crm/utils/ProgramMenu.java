/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class ProgramMenu {

	// ################################# ATTRIBUTS #################################

	private static final int DELIMITER_LENGTH = 21;
	private final String PROG = "PROGRAM : ";
	private String programName;
	private String delimiterChar;
	
	public static final String PROG_REG_POLY	= "POLYGON APPLICATION";
	public static final String PROG_PERSON 		= "PERSON APPLICATION";
	public static final String PROG_PERSON_TEST = "PERSON TEST APPLICATION";

	// ################################ CONSTRUCTOR ################################

	public ProgramMenu(String programName, String delimiterChar) {
		this.programName = programName;
		this.delimiterChar = delimiterChar;
	}

	// ################################## METHODS ##################################

	public void menuHeader() {
		StrGenerate	header;
		String		delimiterStr;
		String		titleStr;
		int			progLen;
		int			totalLen;
		
		header = new StrGenerate(delimiterChar, DELIMITER_LENGTH);
		progLen = programName.length();
		totalLen = header.getDelimiterLength() + progLen;
		delimiterStr = header.delimiterComplex(progLen);
		titleStr = header.delimiterCenterText(PROG.concat(programName), totalLen);

		System.out.println(delimiterStr);
		System.out.println(titleStr);
		System.out.println(delimiterStr);
	}
	
	

}
