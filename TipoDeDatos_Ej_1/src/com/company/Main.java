package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c = 5;
        int ejercicio = -b + c % b * (a - 2 / c) + 1;
        System.out.println(ejercicio);

        a = 2;
        b = -1;
        c = 3;
        ejercicio = -b + c % b * (a - 2 / c) + 1;
        System.out.println(ejercicio);

        a = 4;
        b = -2;
        c = 1;
        boolean ejercicio2 = a < b / 4 || c - b >= a + 4 * b;
        System.out.println(ejercicio2);

        a = 4;
        b = -2;
        c = 1;
        ejercicio2 =  !(a < a % 4) && c - b >= c * b;
        System.out.println(ejercicio2);

        a = 2;
        b = -2;
        c = 10;
        ejercicio2 =  !(a < a % 4) && c - b >= c * -b;
        System.out.println(ejercicio2);
    }
}
