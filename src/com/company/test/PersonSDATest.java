package com.company.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonSDATest {
    private PersonSDA personSDA = new PersonSDA();

    @BeforeEach
    public void init() {
        personSDA = new PersonSDA();
    }

    @Test
    public void testPersonSDAGetter() {

        //GIVEN

        PersonSDA personSDA = new PersonSDA();
        personSDA.setName("Andrzej");

        //WHEN
        String name = personSDA.getName();

        //THEN
        assertNotNull(name);
        assertEquals("Andrzej", name);

    }

    @Test
    public void testPersonSDAFieldName_WhenNull() {

        //GIVEN
        PersonSDA personSDA = new PersonSDA();

        //WHEN
        String name = personSDA.getName();

        //THEN
        assertNull(name);
    }


}