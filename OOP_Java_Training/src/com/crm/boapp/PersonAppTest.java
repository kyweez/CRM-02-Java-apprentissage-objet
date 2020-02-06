/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.Person;

/**
 * @author Aurel
 *
 */
public class PersonAppTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Person pers1 = new Person();
		pers1.setSurname("BOUDIER");
		pers1.setFirstname("Aurelien");
		pers1.setNickname("Boubou");
		pers1.printInfo();

		Person pers2 = new Person();
		pers2.printInfo();

		Person pers3 = new Person("BOUDIER", "Aurelien", "Boubou");
		pers3.printInfo();
	}

}
