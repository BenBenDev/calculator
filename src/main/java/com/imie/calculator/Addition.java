/**
 *
 */
package com.imie.calculator;

/**
 * @author BenBen
 */
public class Addition {
/**
 * Declares the used initial value and set to 0.
 */
    protected int value;
/**
 * sets the initial value.
 * @param a
 */
    public Addition(final int a) {
        this.value = a;
    }
    /**
     * add b to initial value.
     * @param b
     */
    public void make(final int b) {
        this.value += b;
    }
    /**
     * getter for Addition.value.
     * @return the value of value
     */
    public int getValue() {
        return this.value;
    }
}
