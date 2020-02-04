/**
 * 
 */
package com.crm.bo;

import java.util.Date;

/**
 * @author Aurel
 *
 */
public class Personne {

	// #################################Attributs#################################
	private String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;
	private final int AGE_MAJORITE = 18;

	// #################################Methodes#################################

	/**
	 * Methode qui modifie la valeur de l'attribut prenom.
	 * 
	 * @param n = nouveau nom
	 */
	public void setPrenom(String n) {
		prenom = n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
	}

	/**
	 * Methode qui modifie la valeur de l'attribut nom.
	 * 
	 * @param n = nouveau nom
	 */
	public void setNom(String n) {
		nom = n.toUpperCase();
	}

	/**
	 * Methode qui modifie la valeur de l'attribut surnom.
	 * 
	 * @param n = nouveau nom
	 */
	public void setSurnom(String n) {
		surnom = n.substring(0, 1).toUpperCase() + n.substring(1).toLowerCase();
	}

	/**
	 * Cette methode renvoit l'attribut nom.
	 * 
	 * @return nom
	 */
	public String getNom() {
		return (nom);
	}

	/**
	 * Cette methode renvoit l'attribut prenom.
	 * 
	 * @return nom
	 */
	public String getPrenom() {
		return (prenom);
	}

	/**
	 * Cette methode renvoit l'attribut surnom.
	 * 
	 * @return surnom
	 */
	public String getSurnom() {
		return surnom;
	}

	/**
	 * Cette methode affiche les informations de l'objet Personne.
	 */
	public void printInfo() {
		System.out.println("\nNom       : " + getNom());
		System.out.println("Prenom    : " + getPrenom());
		System.out.println("Surnom    : " + surnom);
		System.out.println("Initiales : " + getInitials());
//		System.out.println("Date de naissance : " + dateNaissance);
	}

	/**
	 * Cette methode renvoit les initiales de la personne.
	 * 
	 * @return Initiales du nom et du prenom en majuscule.
	 */
	protected String getInitials() {
		return ((prenom.substring(0, 1) + nom.substring(0, 1)).toUpperCase());
	}
}
