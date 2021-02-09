package com.company.zadanie16;
import com.company.helper;

public class zadanie16 {
    public static void main(String[] args) {
        int[] tablicaLiczb = wczytajDaneDoTablicy(10);
        System.out.println(wyznaczDlugoscNajdluzszegoCiaguRosnacego(tablicaLiczb));
    }
    private static int wyznaczDlugoscNajdluzszegoCiaguRosnacego(int[] tablicaLiczb) {
        int dlugosCiaguBiezacego = 1;
        int maxDlugoscCiagu = 1;
        for (int i = 0; i < tablicaLiczb.length - 1; i++) {
            if (tablicaLiczb[i] < tablicaLiczb[i + 1]) {
                dlugosCiaguBiezacego += 1;
            } else {
                if (dlugosCiaguBiezacego > maxDlugoscCiagu) {
                    maxDlugoscCiagu = dlugosCiaguBiezacego;
                }
                dlugosCiaguBiezacego = 1;
            }
        }
        if (dlugosCiaguBiezacego > maxDlugoscCiagu) {
            maxDlugoscCiagu = dlugosCiaguBiezacego;
        }
        return maxDlugoscCiagu;
    }
    private static int[] wczytajDaneDoTablicy(int wielkoscTablicy) {
        int[] tablicaDanych = new int[wielkoscTablicy];
        for (int i = 0; i < tablicaDanych.length; i++) {
            tablicaDanych[i] = helper.pobierzInta();
        }
        return tablicaDanych;
    }
}