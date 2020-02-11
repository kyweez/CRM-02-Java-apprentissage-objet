/**
 * 
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Person;

/**
 * @author Aurel
 *
 */
public class VectorApp {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//		Vector<Person> group = new Vector<Person>();
		Vector group = new Vector();
		Person michael = new Person("JORDAN", "Michael", "The GOAT");
		Person lebron = new Person("LEBRRON", "James", "The King");

		group.addElement(michael);
		group.addElement(lebron);

		Person basketPlayer = (Person) group.get(0);

		System.out.println(basketPlayer.getNickname());
		System.out.println("Team has " + group.size() + " players");
		
		Person kobe = new Person("BRYANT", "Kobe", "Black Mamba");

		group.addElement(kobe);
		
		System.out.println("Team has " + group.size() + " players");
		System.out.println("Lebron James is positionned at : " + (group.indexOf(lebron) + 1));
		System.out.println("Lebron James nickname : " + ((Person)group.get(1)).getNickname());
		lebron.setNickname("The King James");
		System.out.println("Lebron James nickname : " + ((Person)group.get(1)).getNickname());

	}

}
