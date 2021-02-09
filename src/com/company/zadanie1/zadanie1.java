package com.company.zadanie1;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {

        System.out.println(Wyliczobwod(pobierzsrednice()));

    }

    public static double Wyliczobwod(float srednica) {
        double obwod = srednica * Math.PI;
        return obwod;
    }

    public static float pobierzsrednice() {
        System.out.println("Podaj srednice");
        Scanner scanner = new Scanner(System.in);
        float srednica = scanner.nextFloat();
        return srednica;

    }

}
