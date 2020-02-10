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
public class Person {

	// ################################# ATTRIBUTS #################################

	private String surname;
	private String firstname;
	private String nickname;
//	private final String FR = "France";
//	private final String US = "USA";
//	private final int MAJORITY_AGE_FR = 18;
//	private final int MAJORITY_AGE_US = 21;

	// ################################ CONSTRUCTOR ################################

	public Person() {
		surname = "";
		firstname = "";
		nickname = "";
	}

	public Person(String surname, String firstname, String nickname) {
		this.surname = surname;
		this.firstname = firstname;
		this.nickname = nickname;
	}

	// ################################## METHODS ##################################

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

	public void printInfo(String str) {
		if (str.equalsIgnoreCase("fr")) {
			System.out.println("\nNom          : " + getSurname());
			System.out.println("Prenom       : " + getFirstname());
			System.out.println("Surnom       : " + getNickname());
			System.out.println("Initiales    : " + getInitials());
		}
		else if (str.equalsIgnoreCase("es")) {
			System.out.println("\nAppelido          : " + getSurname());
			System.out.println("Nombre            : " + getFirstname());
			System.out.println("Apodo             : " + getNickname());
			System.out.println("Iniciales         : " + getInitials());
		}
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
			return (matchFirstname.group(0) + matchSurname.group(0).toUpperCase());
		return (null);
	}
}
