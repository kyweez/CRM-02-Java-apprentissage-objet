/**
 * 
 */
package com.crm.bo;

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

	private String brand;
	private String color;
	private byte doorsNumber;
	private boolean automatic = true;
	private float price;

	// ################################ CONSTRUCTOR ################################
	
	public Car() {
		super();
	}

	public Car(String ownerType) {
		super();
		if (ownerType.equalsIgnoreCase(SOC)) {
			brand = "PEUGEOT 206";
			color = WHITE_COLOR;
			doorsNumber = 3;
			automatic = (false);
			price = 12000;
		} else if (ownerType.equalsIgnoreCase(FAM)) {
			brand = "RENAULT ESPACE";
			color = (null);
			doorsNumber = 0;
			automatic = (false);
			price = 0;
		}
	}
	
	// ############################## GETTER & SETTER ##############################
	// ################################## METHODS ##################################
}
