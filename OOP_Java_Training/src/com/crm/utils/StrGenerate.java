/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class StrGenerate {

	// ################################# ATTRIBUTS #################################

	private String delimChar;
	private int delimiterLength;
	public static final String DELIM_EQUAL = "=";
	public static final String DELIM_SHARP = "#";
	public static final String DELIM_STAR = "$";
	public static final String DELIM_AROBASE = "@";
	public static final String DELIM_PLUS = "+";
	public static final String DELIM_TILDE = "~";

	// ################################ CONSTRUCTOR ################################

	public StrGenerate(String delimChar) {
		this.delimChar = delimChar;
	}
	public StrGenerate(String delimChar, int delimiterLength) {
		this.delimChar = delimChar;
		this.delimiterLength = delimiterLength;
	}

	// ############################## GETTER & SETTER ##############################

	/**
	 * @param delimiter you want to set (use the constant inside the class if
	 *                  possible)
	 */
	public void setDelimChar(String delim) {
		this.delimChar = delim;
	}

	/**
	 * @return the delim
	 */
	public String getDelimChar() {
		return (delimChar);
	}


	/**
	 * @return the delimiterLength
	 */
	public int getDelimiterLength() {
		return delimiterLength;
	}
	/**
	 * @param delimiterLength the delimiterLength to set
	 */
	public void setDelimiterLength(int delimiterLength) {
		this.delimiterLength = delimiterLength;
	}
	// ################################## METHODS ##################################

	public String delimiterSimple(int stringLength) {
		String delim = delimChar;
		for (int i = 0; i < stringLength - 1; i++)
			delim = delim.concat(delimChar);
		return (delim);
	}

	public String delimiterComplex(int stringLength) {
		String delim = delimChar;
		if (stringLength % 2 == 0) {
			for (int i = 0; i < (stringLength + delimiterLength - 1); i++)
				delim = delim.concat(delimChar);
		} else {
			for (int i = 0; i < (stringLength + delimiterLength); i++)
				delim = delim.concat(delimChar);
		}
		return (delim);
	}
	
	public String delimiterCenterText(String text, int totalLenght) {
		StringBuffer centerText = new StringBuffer(text);
		if (text.length() < totalLenght - 2) {
			centerText.insert(0, ' ');
			centerText.append(' ');
		}
		for (int i = 0; i < (totalLenght - text.length()) / 2; i++) {
			centerText.insert(0, delimChar);
			centerText.append(delimChar);
		}
		if (centerText.length() % 2 == 0)
			centerText.deleteCharAt(centerText.length() - 1);
		return (centerText.toString());
	}
}
