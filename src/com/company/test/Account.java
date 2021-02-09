package com.company.test;

public class Account {
    private double saldo;
    private char[] numerRachunku;
    private String imie;
    private String nazwisko;
    public Account(double saldo, char[] numerRachunku, String imie, String nazwisko) {
        this.saldo = saldo;
        this.numerRachunku = numerRachunku;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public double przelej(double kwota){
        if(isDebet(kwota)){
            return saldo;
        }
        return saldo = saldo - kwota;
    }
    public double otrzymana(double kwota){
        return saldo= saldo + kwota;
    }
    public boolean isAccountValid(){
        return numerRachunku.length == 5 && isAllDigit();
    }
    private boolean isAllDigit(){
        for(char c : numerRachunku){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public boolean isDebet(double kwota){
        return saldo <= 0 || (saldo-kwota) <= 0;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumerRachunku(char[] numerRachunku) {
        this.numerRachunku = numerRachunku;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public double getSaldo() {
        return saldo;
    }
    public char[] getNumerRachunku() {
        return numerRachunku;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
}