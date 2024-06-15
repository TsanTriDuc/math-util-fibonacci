/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.dustintsan.math.util.swt301.core.test;

import com.dustintsan.math.util.swt301.MathUtilitySWT;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Admin
 */
public class TestNGTest {

    private MathUtilitySWT fibonacciCalculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Initialize resources");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Cleanup resources");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Instantiate FibonacciCalculator");
        fibonacciCalculator = new MathUtilitySWT();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Nullify FibonacciCalculator");
        fibonacciCalculator = null;
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Setup before each test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Cleanup after each test method");
    }

    @DataProvider(name = "fibonacciDataProvider")
    public Object[][] fibonacciDataProvider() {
        return new Object[][]{
            {1, 1},
            {2, 1},
            {3, 2},
            {4, 3},
            {5, 5},
            {6, 8},
            {7, 13},
            {8, 21},
            {9, 34},
            {10, 55}
        };
    }

    @Test(dataProvider = "fibonacciDataProvider")
    public void testCalculateFibonacci(int n, int expectedResult) {
        System.out.println("Test: Calculating Fibonacci for n = " + n);
        int result = fibonacciCalculator.calculateFibonacci(n);
        System.out.println("Result of calculating Fibonacci for n = " + n + " result = " + result);
        Assert.assertEquals(result, expectedResult);
    }
}
