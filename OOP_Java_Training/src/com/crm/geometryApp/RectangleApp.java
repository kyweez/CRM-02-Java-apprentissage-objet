/**
 * 
 */
package com.crm.geometryApp;

import java.util.Scanner;

import com.crm.geometry.Rectangle;
import com.crm.utils.Message;

/**
 * @author Aurel
 *
 */
public class RectangleApp {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		final String WID = "width";
		final String LEN = "length";
		
		Scanner sc;
		Message print;
		Rectangle rec1, rec2;
		sc = new Scanner(System.in);
		print = new Message();
		print.beginPolygon();
		rec1 = new Rectangle();
		rec2 = new Rectangle();
		
		print.enterElementA(WID);
		rec1.setWidth(sc.nextFloat());
		print.enterElementA(LEN);
		rec1.setLength(sc.nextFloat());
		rec1.printData(rec1);
		System.out.println("Perimeter : ".concat(rec1.perimeter("cm")));
		System.out.println("Perimeter : ".concat(rec1.perimeter("M")));
		System.out.println("Area      : ".concat(rec1.area("Cm")));
		System.out.println("Area      : ".concat(rec1.area("m")));
		
		print.enterElementA(WID);
		rec2.setWidth(sc.nextFloat());
		print.enterElementA(LEN);
		rec2.setLength(sc.nextFloat());
		rec2.printData(rec1);
		System.out.println("Perimeter : ".concat(rec2.perimeter("cm")));
		System.out.println("Perimeter : ".concat(rec2.perimeter("M")));
		System.out.println("Area      : ".concat(rec2.area("Cm")));
		System.out.println("Area      : ".concat(rec2.area("m")));
		
		rec1.compareTo(rec2);

		sc.close();
	}

}
