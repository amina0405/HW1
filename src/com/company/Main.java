package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String test = "Hello world";

        final int NUM = 3;

        String WORD = "Fuit";

        test = NUM + WORD;
        System.out.println(test);
        if (NUM < 3) {
            System.out.println("Вы сохронили отрицательное чтсло");
        }

        if (NUM > 3) {
            System.out.println("Вы сохронили положительное число");
        } else {
            System.out.println("Вы сохронили 3");
        }
        Scanner name = new Scanner(System.in);
         String names = name.nextLine();
        System.out.println(names + "Привет!");
    }
}