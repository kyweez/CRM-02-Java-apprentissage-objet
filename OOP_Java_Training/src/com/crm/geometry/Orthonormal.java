/**
 * 
 */
package com.crm.geometry;

import com.crm.utils.PrintClassData;

/**
 * @author Aurel
 *
 */
public class Orthonormal {
	// ############################### ATTRIBUTES ###############################

	private float x;
	private float y;
	private String point;

	// ############################## CONSTRUCTORS ##############################

	public Orthonormal() {
		this.x = 0;
		this.y = 0;
		this.point = null;
	}

	public Orthonormal(float x, float y) {
		this.x = x;
		this.y = y;
		this.point = ("(" + x + " ; " + y + ")" );
	}

	// ########################### GETTERS & SETTERS ############################

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	/**
	 * @return the point
	 */
	public String getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint() {
		this.point = ("(" + x + " ; " +  y + ")" );
	}

	// ################################ METHODS #################################
	public void print(Orthonormal cross) {
		PrintClassData.orthonormal(cross);
	}
	
	public float distanceBetween2Points(Orthonormal anotherPoint) {
		return ((float)Math.sqrt((Math.pow((anotherPoint.getX() - getX()), 2) + Math.pow((anotherPoint.getY() - getY()), 2))));
	}
}
