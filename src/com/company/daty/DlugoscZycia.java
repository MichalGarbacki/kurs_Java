package com.company.daty;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
public class DlugoscZycia {
    public static void main(String[] args) {
        LocalDate calculatedDeathDate = calculateDeathDate(getBirthdayFromUser(), isUserFemale(), isUserSmoking(), isUserStressed());
        System.out.println("Twoja przewidywana data smierci to: " + calculatedDeathDate);
    }
    public static LocalDate getBirthdayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date urodzenia w formacie YYYY-MM-DD:");
        String birthDayString = scanner.nextLine();
        return LocalDate.parse(birthDayString);
    }
    public static boolean isUserFemale() {
        System.out.println("Podaj plec: [k/m]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().equalsIgnoreCase("k");
    }
    public static boolean isUserSmoking() {
        System.out.println("Czy palisz: [y/n]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().equalsIgnoreCase("y");
    }
    public static boolean isUserStressed() {
        System.out.println("Czy zyjesz w stresie: [y/n]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().equalsIgnoreCase("y");
    }
    public static LocalDate calculateDeathDate(LocalDate birthDay, boolean isFemale, boolean isSmoking, boolean isStressed) {
        LocalDate estimatedDeathDate = birthDay.plusYears(100);
        if (!isFemale) {
            estimatedDeathDate = estimatedDeathDate.minusYears(10);
        }
        if (isSmoking) {
            estimatedDeathDate = estimatedDeathDate.minusYears(9).minusMonths(3);
        }
        if (isStressed) {
            Random random = new Random();
            int wylosowana = random.nextInt(100);
            if (wylosowana < 10) {
                estimatedDeathDate = birthDay.plusYears(60);
            }
        }
        return estimatedDeathDate;
    }
}
