package com.company.zadanie2;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {

        System.out.println(Wyliczbmi(pobierzwage(), pobierzwzrost()));

    }
    public static double Wyliczbmi(double waga, double wzrost) {
        double BMI = waga / Math.pow(wzrost / 100,2);
        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("Bmi optymalne");
        } else
            System.out.println("BMI nieoptymalne");
        return BMI;
    }
    public static float pobierzwage() {
        System.out.println("Podaj wage");
        Scanner scanner = new Scanner(System.in);
        float waga = scanner.nextFloat();
        return waga;
    }
    public static int pobierzwzrost() {
        System.out.println("Podaj wzrost");
        Scanner scanner = new Scanner(System.in);
        int wzrost = scanner.nextInt();
        return wzrost;
    }

}
