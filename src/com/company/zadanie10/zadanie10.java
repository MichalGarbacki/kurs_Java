package com.company.zadanie10;
import com.company.helper;

public class zadanie10 {
    public static void main(String[] args) {
        int n = helper.pobierzInta();
        System.out.println(sumujCyfry(n));
    }
    public static int sumujCyfry(int n) {
        int reszta = 0;
        int suma = 0;
        while (n > 10) {
            reszta = (n % 10);
            suma += reszta;
            n /= 10;
        }
        return suma + n;
    }
}

