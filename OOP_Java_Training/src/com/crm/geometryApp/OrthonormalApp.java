/**
 * 
 */
package com.crm.geometryApp;

import java.util.Scanner;
import com.crm.geometry.Orthonormal;
import com.crm.utils.Message;

/**
 * @author Aurel
 *
 */
public class OrthonormalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc;
		Message print;
		Orthonormal pointA, pointB;
		
		sc = new Scanner(System.in);
		print = new Message();
		pointA = new Orthonormal();
		pointB = new Orthonormal();
		
		print.beginOrthonormal();
		print.enterElementA("value for the A abcsissa");
		pointA.setX(sc.nextFloat());
		print.enterElementA("value for the A ordinate");
		pointA.setY(sc.nextFloat());
		pointA.setPoint();
		print.enterElementA("value for the B abcsissa");
		pointB.setX(sc.nextFloat());
		print.enterElementA("value for the B ordinate");
		pointB.setY(sc.nextFloat());
		pointB.setPoint();
		System.out.println("\nA :");
		pointA.print(pointA);;
		System.out.println("\nB :");
		pointA.print(pointB);;
		System.out.println("\nDistance between A and B : " + pointA.distanceBetween2Points(pointB));
		sc.close();	}
}
