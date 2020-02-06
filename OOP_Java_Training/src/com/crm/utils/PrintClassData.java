/**
 * 
 */
package com.crm.utils;

import com.crm.geometry.Orthonormal;
import com.crm.geometry.Rectangle;

/**
 * @author Aurel
 *
 */
public class PrintClassData {
	// ################################# ATTRIBUTS #################################
	
	// ################################ CONSTRUCTOR ################################
	
	// ############################## GETTER & SETTER ##############################
	
	// ################################## METHODS ##################################
	
	public static void quadrilateral(Rectangle rec) {
		if (rec.getWidth() == rec.getLength()) {
			System.out.println("This quadrilateral is a " + rec.getLength() + " length square :");
			System.out.println("Perimeter : " + rec.perimeter());
			System.out.println("Area      : " + rec.area());
		}
		else {
			System.out.println("This quadrilateral is a rectangle : \n");
			System.out.println("Perimeter : " + rec.perimeter());
			System.out.println("Area      : " + rec.area());
		}
	}
	
	public static void orthonormal(Orthonormal crossSystem) {
		System.out.println("Abcsissa            : " + crossSystem.getX());
		System.out.println("Ordinate            : " + crossSystem.getY());
		System.out.println("Coordinate of point : " + crossSystem.getPoint());
	}
	
}