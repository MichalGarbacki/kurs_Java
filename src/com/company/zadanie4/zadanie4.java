package com.company.zadanie4;

import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {
        wypiszLiczbyZZastapieniem(pobierzInta());
    }
    private static void wypiszLiczbyZZastapieniem(int pobranaLiczba) {
        if (pobranaLiczba <= 0) {
            System.out.println("Za mala liczba");
            return;
        }
        for (int i = 1; i <= pobranaLiczba; i++) {
            if (i % 21 == 0) {
                System.out.println("Pif Paf");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else {
                System.out.println(i);
            }
        }
    }
    public static int pobierzInta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj inta: ");
        return scanner.nextInt();
    }
}