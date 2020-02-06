/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Person;

/**
 * @author Aurel
 *
 */
public class PersonApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many persons are you ?");
		Person[] tabPerson = new Person[sc.nextInt()];
		
		for (int i = 0; i < tabPerson.length; i++) {
			tabPerson[i] = new Person();
			System.out.println("\n#####################################################");
			System.out.println("Person number " + (i + 1) + ", please enter your private informations :");
			System.out.println("What is your surname ?");
			tabPerson[i].setSurname(sc.next());
			System.out.println("What is your firstname ?");
			tabPerson[i].setFirstname(sc.next());
			System.out.println("What is your nickname ?");
			tabPerson[i].setNickname(sc.next());

		}
		System.out.println("\nToutes les informations sont saisies :");
		for (Person tab : tabPerson)
			tab.printInfo();
		sc.close();
	}
}
