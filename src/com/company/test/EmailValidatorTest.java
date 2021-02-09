package com.company.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"marzena@gmail", "kowalki@gg.ok"})
    public void testIsValidTrue(String email) {
        //GIVEN
        EmailValidator emailValidator = new EmailValidator();

        //WHEN
        boolean result = emailValidator.isValid(email);
        ;

        //THEN
        assertTrue(result);
    }
}

