package com.geekbrains;

public class Wall extends Barrier {
    private final int heightWall = 3;

    public int getHeightWall() {
        return heightWall;
    }

    protected boolean moving(Actions action) {
        action.jump();
        if (getHeightWall() <= action.getJumpHeight()) {
            System.out.println("Получилось перепрыгнуть");
            return true;
        } else {
            System.out.println("Не в этот раз");
            return false;
        }
    }
}
