package com.geekbrains;

public class Treadmill extends Barrier {
    private final int treadmillLength = 15;

    public int getTreadmillLength() {
        return treadmillLength;
    }

    protected boolean moving(Actions action) {
        action.run();
        if (getTreadmillLength() <= action.getRunLength()) {
            System.out.println("Получилось пробежать");
            return true;
        } else {
            System.out.println("Не в этот раз");
            return false;
        }
    }
}
