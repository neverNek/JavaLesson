package com.geekbrains;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("Не удалось (" + i + ", " + j + ")");
    }
}
