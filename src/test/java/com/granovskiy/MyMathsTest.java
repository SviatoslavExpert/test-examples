package com.granovskiy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MyMathsTest {

    private MyMaths myMaths = new MyMaths();

    @BeforeClass
    public static void classInit() {
        System.out.println("Before class");
    }

    @Before
    public void init() {
        myMaths = new MyMaths();
        System.out.println("Test");
    }

    @Test
    public void testPowThatShouldReturnSuccessfulPower() {
        int expectedResult = 25;
        int actualResult = myMaths.pow(5,2);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = IllegalStateException.class)
    public void testPowThatShouldThrowISEOnNegativePowerArg() {
        myMaths.pow(5, -2);
    }

    @Test
    public void testAbsThatShouldReturnSuccessfulResult() {
        int expectedResult = 5;
        int actualResult = myMaths.abs(-5);
        assertEquals(expectedResult, actualResult);
    }
}
