package com.geekbrains;

public class Cat implements Actions {
    private final int jumpHeight = 2;
    private final int runLength = 20;

    @Override
    public void jump() {
        System.out.println("Перепрыгнул");
    }

    @Override
    public void run() {
        System.out.println("Бег");
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }
}
