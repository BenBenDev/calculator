/**
 *
 */
package com.imie.calculator;

/**
 * @author BenBen
 *
 */
public class Addition {

    protected int value = 0;
/**
 * sets the initial value
 * @param a
 */
    public Addition(int a) {
        this.value = a;
    }
    /**
     * add b to initial value
     * @param b
     */
    public void make(int b) {
        this.value += b;
    }
    /**
     * getter for Addition.value
     * @return the value of value
     */
    public int getValue() {
        return this.value;
    }
}
