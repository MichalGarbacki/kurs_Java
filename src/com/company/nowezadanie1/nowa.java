package com.company.nowezadanie1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class nowa {

    public static void main(String[] args) {
        wypiszDane();
    }
    public static String wczytajPolecenie() {
        System.out.println("Zeby zobaczyc date wpisz \"date\" jesli czas to wpisz \"time\" jesli data i czas to wpisz \"datetime\" , jesli zakoncz to \"quit\"");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static void wypiszDane() {
        String wczytanePolecenie;
        do {
            wczytanePolecenie = wczytajPolecenie();
            LocalDate now = LocalDate.now();
            LocalTime localTime = LocalTime.now();
            LocalDateTime localDateTime = LocalDateTime.now();
            if (wczytanePolecenie.equals("date")) {
                System.out.println(now);
            } else if (wczytanePolecenie.equals("time")) {
                System.out.println(localTime);
            } else if (wczytanePolecenie.equals("datetime")) {
                System.out.println(localDateTime);
            }
        } while (!wczytanePolecenie.equals("quit"));
    }
}