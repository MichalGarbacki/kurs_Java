package com.company.zadanie7;
import com.company.helper;

public class zadanie7 {
    public static void main(String[] args) {
        int n = helper.pobierzInta();
        System.out.println(getNFibonnaciNumberFromTable(n));
    }

/*        public static int getNFibonaciNumber(int n) {
        int fib = 1;
        int prevFib = 1;

        for (int i =2; i <n; i++){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }*/

    public static int getNFibonnaciNumberFromTable(int n) {
        if (n <= 2) {
            return 1;
        }
        int[] fibTable = new int[n];
        fibTable[0] = 1;
        fibTable[1] = 1;
        for (int i = 2; i < n; i++) {
            fibTable[i] = fibTable[i - 1] + fibTable[i - 2];
        }
        return fibTable[n - 1];
    }
}
