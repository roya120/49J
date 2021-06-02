package com.company;
import junit.framework.TestCase;

public class E5_18Test extends TestCase {

    private E5_18 test1;


    public void setUp() throws Exception {
        this.test1 = new E5_18();


    }


    public void testTaxCall()
    {
        double income = 75000.0;


        double expected= 1000.0;
        double actual;
        actual = this.test1.taxCall(income);
        assertEquals(expected, actual);

    }

    public void test2Call ()
    {
        double income = 250000.0;


        double expected= 7750.0;
        double actual;
        actual = this.test1.taxCall(income);
        assertEquals(expected, actual);

    }
    public void test3Call ()
    {
        double income = 250000.0;


        double expected= 770.0;
        double actual;
        actual = this.test1.taxCall(income);
        assertEquals(expected, actual);

    }

}