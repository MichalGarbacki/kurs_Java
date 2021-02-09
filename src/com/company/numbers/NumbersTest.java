package com.company.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    public void testIsOdd(int number){
        assertTrue(Numbers.isOdd(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {6, 12, 18})
    public void test(int number){
        //GIVEN
        Numbers numbers =  new Numbers();
        //WHEN
        boolean result = numbers.isParzystaAndPodzielnaPrzez3(number);
        //THEN
        assertTrue(result);
//        assertFalse();
    }


}