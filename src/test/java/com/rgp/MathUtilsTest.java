package com.rgp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd() {
        //System.out.println("Tests are running");
       // fail("not yet implemented");
        MathUtils utils = new MathUtils();
        int expected = 2;
        int result = utils.add(1,1);
        assertEquals(expected,result,"this method adds the two integers and return integer");
    }
    @Test
    void testDivide()
    {
        MathUtils utils = new MathUtils();
        assertThrows(ArithmeticException.class,()->utils.divide(1,0),"Divide by 0 will leads Arithmetic exception");


    }

    @Test
    void testComputCircleArea()
    {
        MathUtils utils = new MathUtils();
        assertEquals(314.1592653589793,utils.computeCircleArea(10.0),"Method failure in the computeCircleRadius");


    }
}