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
}