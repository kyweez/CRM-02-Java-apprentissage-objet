/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
 * @author Aurel
 *
 */
public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de personne etes vous ?");
		Personne[] tabPersonne = new Personne[sc.nextInt()];
		
		
		
		for (int i = 0; i < tabPersonne.length; i++) {
			tabPersonne[i] = new Personne();
			System.out.println("\n####################################################################");
			System.out.println("Personne numero " + (i + 1) + ", veuillez entrez vos informations :");
			System.out.println("Quel est votre nom ?");
			tabPersonne[i].setNom(sc.next());
			System.out.println("Quel est votre prenom ?");
			tabPersonne[i].setPrenom(sc.next());
			System.out.println("Quel est votre surnom ?");
			tabPersonne[i].setSurnom(sc.next());
		}
		System.out.println("\nToutes les informations sont saisies :");
		for (int i = 0; i < tabPersonne.length; i++)
			tabPersonne[i].printInfo();
		sc.close();
	}
}
