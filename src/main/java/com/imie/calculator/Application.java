/********************
 * (c)2018 IMIE.
 * application in java to test Jenkins
 ********************/
package com.imie.calculator;

/**
 * @author BenBen application in java to test Jenkins.
 */
public class Application {

    /**
     * This is the main application.
     */
    public static void main() {

        Addition add = new Addition(1);

        add.make(2);
        System.out.println(add.getValue());

        add.make(3);
        System.out.println(add.getValue());

        System.out.println("END");
    }
}
