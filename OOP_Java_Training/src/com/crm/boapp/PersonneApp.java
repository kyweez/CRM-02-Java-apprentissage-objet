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
		System.out.println("How many persons are you ?");
		Personne[] tabPersonne = new Personne[sc.nextInt()];
				
		for (int i = 0; i < tabPersonne.length; i++) {
			tabPersonne[i] = new Personne();
			System.out.println("\n#####################################################");
			System.out.println("Person number " + (i + 1) + ", please enter your private informations :");
			System.out.println("What is your surname ?");
			tabPersonne[i].setSurname(sc.next());
			System.out.println("What is your firstname ?");
			tabPersonne[i].setFirstname(sc.next());
			System.out.println("What is your nickname ?");
			tabPersonne[i].setNickname(sc.next());

		}
		System.out.println("\nToutes les informations sont saisies :");
		for (Personne tab : tabPersonne)
			tab.printInfo();
		sc.close();
	}
}
