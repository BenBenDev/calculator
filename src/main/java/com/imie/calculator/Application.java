/**
 * 
 */
package com.imie.calculator;

/**
 * @author BenBen
 *
 */
public class Application {

	Application add = new Application();
	
	public static void main(String[] args) {
	  Addition add  = new Addition(1);
	  
	  add.make (2);
	  System.out.println(add.getValue());
	  
	  add.make (3);
	  System.out.println(add.getValue());
	 
	}
}
