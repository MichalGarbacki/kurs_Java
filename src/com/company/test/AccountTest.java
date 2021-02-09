package com.company.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AccountTest {
    Account account;
    @BeforeEach
    public void init(){
        double saldo = 10.00;
        char[] numberKonta = {'1','2','3','4','5'};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        account =  new Account(saldo, numberKonta, imie, nazwisko);
    }
    @Test
    public void testIsDebet(){
        //WHEN
        boolean result = account.isDebet(15);
        //THEN
        assertTrue(result);
    }
    @Test
    public void testIsDebetFalse(){
        //GIVEN
        double saldo = 10.00;
        char[] numberKonta = {1,2,3,4,5};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        //WHEN
        boolean result = account.isDebet(5);
        //THEN
        assertFalse(result);
    }
    @Test
    public void testIsDebetMinus(){
        //GIVEN
        double saldo = -5.00;
        char[] numberKonta = {1,2,3,4,5};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        //WHEN
        boolean result = account.isDebet(0);
        //THEN
        assertTrue(result);
    }
    @Test
    public void testIsValidAccount(){
        //GIVEN
        double saldo = 10.00;
        char[] numberKonta = {'1', '2', '3', '4', '6'};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        //WHEN
        boolean result = account.isAccountValid();
        //THEN
        assertTrue(result);
    }
    @Test
    public void testIsValidAccountFalse(){
        //GIVEN
        double saldo = 10.00;
        char[] numberKonta = {'1', '2', '3', '4', 'a'};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        //WHEN
        boolean result = account.isAccountValid();
        //THEN
        assertFalse(result);
    }
    @Test
    public void testSend(){
        //GIVEN
        double saldo = 10.00;
        char[] numberKonta = {'1', '2', '3', '4', 'a'};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        double kwota = 5.00;
        double oczekiwaneSaldo = 5.00;
        //WHEN
        double saldoResult = account.przelej(kwota);
        //THEN
        assertEquals(oczekiwaneSaldo, saldoResult);
    }
    @Test
    public void testSendMinus(){
        //GIVEN
        double saldo = -10.00;
        char[] numberKonta = {'1', '2', '3', '4', 'a'};
        String imie = "Jan";
        String nazwisko = "Kowalski";
        Account account = new Account(saldo, numberKonta, imie, nazwisko);
        double kwota = 5.00;
        double oczekiwaneSaldo = -10.00;
        //WHEN
        double saldoResult = account.przelej(kwota);
        //THEN
        assertEquals(oczekiwaneSaldo, saldoResult);
    }
    @Test
    public void testPrzelewana(){
        //GIVEN
        double saldo = 100.00;
        char[] numberKonta = {'1','2', '3', '4', '5'};
        String imie = "Kazimierz";
        String naziwsko = "Gogus";
        Account account = new Account(saldo, numberKonta, imie, naziwsko);
        double przelewanaKwota = 20.00;
        double oczekiwaneSaldo = 80.00;
        //WHEN
        double saldoRezultat = account.przelej(przelewanaKwota);
        //THEN
        assertEquals(oczekiwaneSaldo, saldoRezultat);
    }
    @Test
    public void testOtrzymana(){
        //GIVEN
        double saldo = 100.00;
        char[] numberKonta = {'1','2', '3', '4', '5'};
        String imie = "Kazimierz";
        String naziwsko = "Gogus";
        Account account = new Account(saldo, numberKonta, imie, naziwsko);
        double otrzymanaKwota = 20.00;
        double oczekiwaneSaldo = 120.00;
        //WHEN
        double saldoRezultat = account.otrzymana(otrzymanaKwota);
        //THEN
        assertEquals(oczekiwaneSaldo, saldoRezultat);
    }
}