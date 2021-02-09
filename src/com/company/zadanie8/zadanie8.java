package com.company.zadanie8;
import java.util.Scanner;

public class zadanie8 {

    public static void main(String[] args) {
        Float a = oblicz();
        if(a != null) {
            System.out.println(a);
        }
        else{
            System.out.println("Błąd");
        }
    }
    public static Float oblicz(){
        Float wynik = null;
        Scanner sc = new Scanner(System.in);
        float liczba1 = sc.nextFloat();
        sc.nextLine();
        String znak = sc.nextLine();
        float liczba2 = sc.nextFloat();
        if(znak.equals("+")){
            wynik = liczba1 + liczba2;
        }
        else if(znak.equals("-")){
            wynik = liczba1 - liczba2;
        }
        else if(znak.equals("*")){
            wynik = liczba1 * liczba2;
        }
        else if(znak.equals("/")){
            if(liczba2 != 0) {
                wynik = liczba1 / liczba2;
            }
        }
        else {
            System.out.println("Błędny znak");
        }
        return wynik;
    }
}