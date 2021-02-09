package com.company.numbers;

public class Numbers {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public boolean isParzystaAndPodzielnaPrzez3(int number) {
        return number % 2 == 0 && number % 3 == 0;
    }

}
