package com.company.zadanie3;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        System.out.println(delta(pobierzLiczbePierwsza(), pobierzLiczbeDruga(), pobierzLiczbeTrzecia()));

    }

    public static double delta(double liczba1, double liczba2, double liczba3) {
        double delta = Math.pow(liczba2, 2) - 4 * liczba1 * liczba3;
        if (delta > 0) {
            System.out.println("x1 =" + ((liczba2 * (-1) - Math.sqrt(delta))) / (2 * liczba1));
            System.out.println("x2 =" + ((liczba2 * (-1) + Math.sqrt(delta))) / (2 * liczba1));
        } else
            System.out.println("Delta ujemna");
        return delta;
    }

    public static double pobierzLiczbePierwsza() {
        System.out.println("Podaj liczbę pierwszą");
        Scanner scanner = new Scanner(System.in);
        double liczba1 = scanner.nextDouble();
        return liczba1;
    }

    public static double pobierzLiczbeDruga() {
        System.out.println("Podaj liczbę drugą");
        Scanner scanner = new Scanner(System.in);
        double liczba2 = scanner.nextDouble();
        return liczba2;
    }

    public static double pobierzLiczbeTrzecia() {
        System.out.println("Podaj liczbę trzecia");
        Scanner scanner = new Scanner(System.in);
        double liczba3 = scanner.nextDouble();
        return liczba3;
    }

}
