/**
 * 
 */
package com.learning.udemy.overloading;

/**
 * @author Abhishek Panwar
 *
 */
public class OverloadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calFeetAndInchesToCentimeters(6, 0);
		calFeetAndInchesToCentimeters(100);
	}
	
	public static double calFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet<0) || (inches<0 || inches >12)) {
			System.out.println("Please check feet or inches paramter value !!!");
			return -1;
		}
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println("Converted Value of feet and inches to centermeter is :" + centimeters + " cm");
		return centimeters;
	}
	
	public static double calFeetAndInchesToCentimeters(double inches) {
		if(inches <0 ) {
			System.out.println("Please check inches parameter value !!!");
			return -1;
		}
		 double feet = (int) inches / 12;
		 double remainingInches = (int) inches % 12;
		 System.out.println("Feet is " + feet + " inches is " + remainingInches);
		 return calFeetAndInchesToCentimeters(feet, remainingInches);
		 
	}

}
