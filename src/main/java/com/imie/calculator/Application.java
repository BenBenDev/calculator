/********************
 * (c)2018 IMIE
 * application in java to test Jenkins
 ********************/
package com.imie.calculator;

/**
 * @author BenBen
 * application in java to test Jenkins
 */
public class Application {
    
/**
 *main application
 */
    public static void main() {
        int a=2; // useless ; just for test

        Addition add  = new Addition(1);
      
      add.make (2);
      System.out.println(add.getValue());
      
      add.make (3);
      System.out.println(add.getValue());
      
      System.out.println("END");
    }
}
