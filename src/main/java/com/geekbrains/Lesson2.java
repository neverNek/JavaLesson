package com.geekbrains;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(twoNumbers(9, 11));
        positiveNumber(1);
        System.out.println(task3(1));
        task4(2, "Hi");
        System.out.println(task5(2008));
    }

    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean task3(int a) {
        return a >= 0;
    }

    public static void task4(int a, String s) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean task5(int a) {
        if (a % 4 == 0 && a % 100 != 0) {
            return true;
        } else return a % 4 == 0 && a % 100 == 0 && a % 400 == 0;
    }
}
