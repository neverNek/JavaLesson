package com.geekbrains;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Красный");
        list.add("Оранжевый");
        list.add("Фиолетовый");
        list.add("Жёлтый");
        list.add("Красный");
        list.add("Зелёный");
        list.add("Голубой");
        list.add("Синий");
        list.add("Фиолетовый");
        list.add("Зелёный");

        Map<String, String> hMap = new LinkedHashMap<>();

        for (String s : list) {
            if (!hMap.containsKey(s)) {
                hMap.put(s, "Уникальный");
            }
        }

        System.out.println(hMap);

        Map<String, Integer> countByWords = new HashMap<>();

        for (String s : list) {
            countByWords.merge(s, 1, Integer::sum);
        }

        System.out.println(countByWords);

        PhoneList phoneList = new PhoneList();

        phoneList.add("Петров", "+79546325874");
        phoneList.add("Сидоров", "+79854562585");
        phoneList.add("Петров", "+79653214578");

        System.out.println(phoneList.get("Петров"));

    }
}
