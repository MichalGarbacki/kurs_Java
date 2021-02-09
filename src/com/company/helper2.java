package com.company;

import java.util.Scanner;

public class helper2 {
    static Scanner input = new Scanner(System.in);
    public static int readInteger(String text){
        System.out.print(text);
        return input.nextInt();
    }
}