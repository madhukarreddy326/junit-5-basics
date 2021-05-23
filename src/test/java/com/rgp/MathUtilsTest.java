package com.rgp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)//this will create instance of MathUtilsTest only once
    //in case of Per_class then @BeforeAll and @AfterAll can be used without static
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
//this will create instance of MathUtilsTest per each test method
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
    void testComputCircleArea()
    {
       assertEquals(314.1592653589793,utils.computeCircleArea(10.0),"Method failure in the computeCircleRadius");
    }

    @Test
    @DisplayName("This method is form TDD")
    @Disabled
    void testTDD()
    {
        System.out.println("this method is related to TDD");
    }
}