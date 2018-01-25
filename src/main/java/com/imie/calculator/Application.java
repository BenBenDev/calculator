/**
 * 
 */
package com.imie.calculator;

/**
 * @author BenBen
 *
 */
public class Application {
	
	public static void main(String[] args) {
		int a=2; // useless ; just for test

		Addition add  = new Addition(1);
	  
	  add.make (2);
	  System.out.println(add.getValue());
	  
	  add.make (3);
	  System.out.println(add.getValue());
	  
	  System.out.println("END");
	}
}
