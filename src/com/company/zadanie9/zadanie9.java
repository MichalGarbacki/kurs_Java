package com.company.zadanie9;

import com.company.helper2;

public class zadanie9 {

    static int WAVE_HEIGHT = 8;

    public static void main(String[] args) {
        int length = helper2.readInteger("Length of wave: ");
        generateWave(length);
    }

    public static void generateWave(int length) {
        boolean[][] wave = new boolean[WAVE_HEIGHT][length];
        boolean goingDown = true;
        boolean evenRow = false;
        int level = 0;
        for (int i = 0; i < length; i++) {
            if (level == WAVE_HEIGHT) {
                goingDown = false;
                if (evenRow) {
                    level -= 2;
                } else {
                    level -= 1;
                }
            } else if (level == -1) {
                evenRow = !evenRow;
                goingDown = true;
                level += 1;
            }
            wave[level][i] = true;
            if (goingDown) {
                level++;
            } else {
                level--;
            }
        }
        printWave(wave);
    }

    public static void printWave(boolean[][] wave) {
        for (boolean[] booleans : wave) {
            System.out.println(boolArrayToString(booleans));
        }
    }

    public static String boolArrayToString(boolean[] boolArray) {
        StringBuilder s = new StringBuilder();
        for (boolean bool : boolArray) {
            s.append(bool ? "*" : " ");
        }
        return s.toString();
    }
}
