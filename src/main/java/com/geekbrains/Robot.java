package com.geekbrains;

public class Robot implements Actions {
    private final int jumpHeight = 2;
    private final int runLength = 20;

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
