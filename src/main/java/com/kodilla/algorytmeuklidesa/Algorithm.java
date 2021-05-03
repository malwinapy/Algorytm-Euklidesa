package com.kodilla.algorytmeuklidesa;

public class Algorithm {
    public static void main(String[] args) {

        int a=4;
        int b=160;

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("the greatest common divisor = " + a);
    }
}
