package com.geekbrains;

public class Human implements Actions {
    private final int jumpHeight = 3;
    private final int runLength = 10;

    @Override
    public void jump() {
        System.out.println("Прыжок");
    }

    @Override
    public void run() {
        System.out.println("Бег");
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }
}
