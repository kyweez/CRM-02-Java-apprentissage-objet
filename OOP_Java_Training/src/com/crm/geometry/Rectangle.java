/**
 * 
 */
package com.crm.geometry;

import com.crm.utils.PrintClassData;

/**
 * @author Aurel
 *
 */
public class Rectangle {

	// ################################# ATTRIBUTS #################################

	float width;
	float length;

	// ################################ CONSTRUCTOR ################################
	// ############################## GETTER & SETTER ##############################

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	// ################################## METHODS ##################################

	public float area() {
		// TODO gerer les cas de depassement
		return (width * length);
	}

	public float perimeter() {
		// TODO gerer les cas de depassement
		return ((width + length) * 2);
	}

	public String area(String unity) {
		// TODO gerer les cas de depassement
		StringBuffer str = new StringBuffer(unity);
		if (unity.equalsIgnoreCase("cm") || unity.equalsIgnoreCase("m") ) {
			str.insert(0, ' ');
			str.append("^2");
			return (String.valueOf((width * length)).concat(str.toString().toLowerCase()));
		}
		else
			return (null);
	}

	public String perimeter(String unity) {
		// TODO gerer les cas de depassement
		// TODO gerer les cas de depassement
		StringBuffer str = new StringBuffer(unity);
		if (unity.equalsIgnoreCase("cm") || unity.equalsIgnoreCase("m") ) {
			str.insert(0, ' ');
			return (String.valueOf((width + length) * 2).concat(str.toString().toLowerCase()));
		}
		else
			return (null);
	}

	public boolean isEqual(Rectangle rec) {
		if (getLength() == rec.getLength() && getWidth() == rec.getWidth())
			return (true);
		else
			return (false);
	}

	public boolean areaIsBiggerThan(Rectangle rec) {
		return (area() > rec.area() ? true : false);
	}

	public boolean areaIsEqual(Rectangle rec) {
		return (area() == rec.area() ? true : false);
	}

	public void printData(Rectangle rec) {
		PrintClassData.quadrilateral(rec);
	}

	public void compareTo(Rectangle rec) {
		if (isEqual(rec))
			System.out.println("\nThese 2 quadrilaterals are identical.");
		else if (areaIsBiggerThan(rec))
			System.out.println("\nThe first rectangle is bigger than the other");
		else {
			if (areaIsEqual(rec))
				System.out.println("\nThese rectangles are different but they have same areas and perimeter");
			else
				System.out.println("\nThe second rectangle is bigger than the first one");

		}

	}
}
