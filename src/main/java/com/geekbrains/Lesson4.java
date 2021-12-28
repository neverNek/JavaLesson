package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static char[][] map;
    public final static int SIZE = 5;
    public final static int DOT_TO_WIN = 4;
    public final static char DOT_EMPTY = '.';
    public final static char DOT_X = 'X';
    public final static char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите данные координат X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
            return false;
        if (map[y][x] == DOT_EMPTY)
            return true;
        return false;
    }

    public static boolean checkWin(char symb) {
        // проверка по горизонтали
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0, x = 0, y = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    x++;
                } else {
                    y++;
                }
                if (x == DOT_TO_WIN && y == 0) {
                    return true;
                }
            }
        }

        // проверка по вертикали
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0, x = 0, y = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    x++;
                } else {
                    y++;
                }
                if (x == DOT_TO_WIN && y == 0) {
                    return true;
                }
            }
        }

        // проверка по диагонали с права на лево
        for (int i = 0, x = SIZE - 1, y = 0, z = 0; i < SIZE; i++) {
            if (map[i][x] == symb) {
                x--;
                y++;
            } else {
                z++;
            }
            if (y == DOT_TO_WIN && z == 0) {
                return true;
            }
        }

        // проверка по диагонали с лева на право
        for (int i = 0, x = 0, y =0; i < SIZE; i++) {
            if (map[i][i] == symb) {
                x++;
            } else {
                y++;
            }
            if (x == DOT_TO_WIN && y == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }
}
