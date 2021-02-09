package com.company.zadanie6;

/*
Napisz program, który bierze od użytkownika liczbę n ( typu int) i obliczy sumę szeregu harmonicznego
od 1 do n, zgodnie ze wzorem poniżej;
*/

import com.company.helper;

public class zadanie6 {
    public static void main(String[] args) {
        System.out.println(sumaSzereguHarmonicznego(helper.pobierzInta()));
    }

    public static double sumaSzereguHarmonicznego(int number) {
        double sumaSzeregu = 0;
        for (int i = 1; i <= number; i++) {
            sumaSzeregu += (1.0 / i);
        }
        return sumaSzeregu;
    }
}
