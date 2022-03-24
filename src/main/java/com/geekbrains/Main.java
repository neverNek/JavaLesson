package com.geekbrains;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Actions[] actions = new Actions[3];
        actions[0] = new Cat();
        actions[1] = new Human();
        actions[2] = new Robot();

        Barrier[] barriers = new Barrier[6];

        boolean test;
        for (int i = 0; i < barriers.length; i++) {
            test = random.nextBoolean();
            if (test) {
                barriers[i] = new Treadmill();
            } else {
                barriers[i] = new Wall();
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(actions[i]);
                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успех");
            } else {
                System.out.println("Не в этот раз");
            }
        }
    }

}
