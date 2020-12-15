package com.ntsan.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.addition(5, 15);
        Assert.assertEquals(20, result);
    }

    @Test
    public void testSubstraction() {
        Calculator calculator = new Calculator();
        int result = calculator.substraction(15, 5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(5, 5);
        Assert.assertEquals(25, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.division(9, 3);
        Assert.assertEquals(3, result);
    }

}