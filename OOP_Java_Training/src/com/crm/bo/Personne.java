/**
 * 
 */
package com.crm.bo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aurel
 *
 */
public class Personne {

	// #################################Attributes#################################
	private String nickname;
	private String surname;
	private String firstname;
	private final String FR = "France";
	private final String US = "USA";
	private final int MAJORITY_AGE_FR = 18;
	private final int MAJORITY_AGE_US = 21;

	// #################################Methods#################################

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void printInfo() {
		System.out.println("\nName         : " + getSurname());
		System.out.println("Firstname    : " + getFirstname());
		System.out.println("Nickname     : " + getNickname());
		System.out.println("Initials     : " + getInitials());
	}

	/**
	 * 
	 * The pattern follows the regex "\\b[a-zA-Z]" (
	 * 
	 * @return initials of the given surname and firstname
	 */
	public String getInitials() {
		Pattern paternInitials;
		Matcher matchSurname;
		Matcher matchFirstname;
		
		paternInitials = Pattern.compile("\\b[a-zA-Z]");
		matchSurname = paternInitials.matcher(surname);
		matchFirstname = paternInitials.matcher(firstname);
		if (matchFirstname.find() && matchSurname.find())
			return(matchFirstname.group(0) + matchSurname.group(0).toUpperCase());
		return (null);
	}
}
