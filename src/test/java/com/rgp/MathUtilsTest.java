package com.rgp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)//this will create instance of MathUtilsTest only once
    //in case of Per_class then @BeforeAll and @AfterAll can be used without static
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//this will create instance of MathUtilsTest per each test method
@DisplayName("When Running MathUtilsTest")
class MathUtilsTest {
    MathUtils utils;

    @BeforeAll
     void beforeAllInit()
    {
        System.out.println("This should be called first and it should be called one time @BeforeAll");
    }

    @BeforeEach
    void init() {

        utils = new MathUtils();
    }
    @AfterEach
    void cleanUp()
    {
        System.out.println("This is the method form @AfterEach");
    }
    @AfterAll
     void cleanUpAll()
    {
        System.out.println("This method will be called after all tests are executed @AfterAll");
    }

    @Nested
    @DisplayName("Add method")
    class AddTest
    {
        @Test
        @DisplayName("When Adding for Positive Numbers")
        void testPositive()
        {
            assertEquals(2,utils.add(1,1),"should return the positive Number");

        }
        @Test
        @DisplayName("When Adding for Negative Numbers")
        void testNegative()
        {
            assertEquals(-2,utils.add(-1,-1),"Should return the Negative Numbers");

        }
        @Test
        @DisplayName("When Adding for Positive and Negative Numbers")
        void testPositiveAndNegative()
        {
            assertEquals(0,utils.add(-1,1),"should return 0");

        }
        @Test
        @DisplayName("When Adding for 0 and 0 Numbers")
        void testaddZero()
        {
            assertEquals(0,utils.add(0,0),"should return 0");

        }
    }
    @Test
    void testAdd() {
        //System.out.println("Tests are running");
      // fail("not yet implemented");
        int expected = 2;
        int result = utils.add(1,1);
        assertEquals(expected,result,"this method adds the two integers and return integer");
    }
    @Test
    void testDivide()
    {
        assertThrows(ArithmeticException.class,()->utils.divide(1,0),"Divide by 0 will leads Arithmetic exception");
    }

    @Test
    @RepeatedTest(3)
    void testComputCircleArea()
    {
       assertEquals(314.1592653589793,utils.computeCircleArea(10.0),"Method failure in the computeCircleRadius");
    }
    @Test
    @DisplayName("Method to test Multiply")
    void testMultiply()
    {

        Assertions.assertAll(
                ()->assertEquals(2,utils.multiply(2,1)),
        ()->assertEquals(0,utils.multiply(2,0)),
        ()->assertEquals(-2,utils.multiply(2,-1))
        );
    }

    @Test
    @DisplayName("This method is from TDD")
    @Disabled
    void testTDD()
    {
        System.out.println("this method is related to TDD");
    }
    @Test
    @DisplayName("This method is from testEnabled")
    @EnabledOnOs(OS.LINUX)
    void testEnabled()
    {
        System.out.println("this method is related to TDD");
    }
    @Test
    @DisplayName("This method is to test assumeTrue")
    void testAssume()
    {
        boolean isServerUp = false;
        assumeTrue(isServerUp);
        System.out.println("this method is related to TDD");
    }



}