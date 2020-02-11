/**
 * 
 */
package com.crm.bo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Aurel
 *
 */
public class Car {
	// ################################# CONSTANTS #################################
	public static final String SOC = "Society";
	public static final String FAM = "Family";
	public static final String BLUE_COLOR = "Blue";
	public static final String WHITE_COLOR = "White";
	public static final String BLACK_COLOR = "Black";
	public static final String GREEN_COLOR = "Green";
	public static final String RED_COLOR = "Red";
	public static final String GREY_COLOR = "Grey";
	// ################################# ATTRIBUTS #################################
	
	private String	brand;
	private	String	color;
	private	byte	doorsNumber;
	private	boolean	automatic = true;
	private	float	price;
	// ################################ CONSTRUCTOR ################################
	public Car() {
		brand = (null);
		color = (null);
		doorsNumber = 0;
		automatic = (false);
		price = 0;
	}
	
	public Car(String ownerType) {
		if(ownerType.equalsIgnoreCase(SOC)) {
			brand = (null);
			color = (null);
			doorsNumber = 0;
			automatic = (false);
			price = 0;
		}
		else if (ownerType.equalsIgnoreCase(FAM)) {
			brand = (null);
			color = (null);
			doorsNumber = 0;
			automatic = (false);
			price = 0;
		}
		else {
			super();
		}
			
	}
	// ############################## GETTER & SETTER ##############################
	// ################################## METHODS ##################################
}
