package com.company.test;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double odejmij(double a, double b) {
        return a - b;
    }

    public double podziel(double a, double b) {
        return a / b;
    }

    public double pomnóż(double a, double b) {
        return a * b;
    }

    public double tabl(double[] a) {
        double c = 0;
        for (int i = 0; i < a.length; i++) {
            c += a[i];
        }
        return c;

    }

}
