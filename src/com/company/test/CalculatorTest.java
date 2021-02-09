package com.company.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        //GIVEN
        double a = 2.0;
        double b = 2.0;
        double expected = 4.0;
        Calculator calculator = new Calculator();

        //WHEN
        double result = calculator.add(a, b);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void testOdejmij() {

        //GIVEN
        double a = 2.0;
        double b = 2.0;
        double expected = 0;

        //WHEN
        double result = calculator.odejmij(a, b);

        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void testPodziel() {

        //GIVEN
        double a = 2.0;
        double b = 2.0;
        double expected = 1;

        //WHEN
        double result = calculator.podziel(a, b);

        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void testPomnóż() {

        //GIVEN
        double a = 2.0;
        double b = 2.0;
        double expected = 4;

        //WHEN
        double result = calculator.pomnóż(a, b);

        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void testTablica() {

        //GIVEN
        double[] a = {2.0, 2.0};
        double expected = 4.0;
        Calculator calculator = new Calculator();

        //WHEN
        double result = calculator.tabl(a);

        //THEN
        assertEquals(expected, result);
    }

}
