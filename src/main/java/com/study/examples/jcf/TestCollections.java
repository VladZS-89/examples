package com.study.examples.jcf;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java"); // Добавляем элемент в список

        Set<String> set = new HashSet<>();
        set.add("Java"); // Добавляем элемент в множество

        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value"); // Добавляем пару ключ-значение в map

        list.remove("Java"); // Удаляем элемент из списка
        set.remove("Java"); // Удаляем элемент из множества
        map.remove("Key"); // Удаляем элемент из map по ключу

        boolean existsInList = list.contains("Java"); // Проверяем наличие элемента в списке
        boolean existsInSet = set.contains("Java"); // Проверяем наличие элемента в множестве
        boolean existsInMap = map.containsKey("Key"); // Проверяем наличие ключа в map

        int sizeOfList = list.size(); // Получаем размер списка
        int sizeOfSet = set.size(); // Получаем размер множества
        int sizeOfMap = map.size(); // Получаем размер map

        final List<String> names = List.of("mark", "mike", "kate");
        for (String name : names) { // цикл for-each
            System.out.println(name);
        }
        final Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            final String name = iterator.next();
            if ("mike".equals(name)) {
                iterator.remove();
            }
        }
        System.out.println(names); // [mark, kate]

        final Map<String, Integer> customers = new HashMap<>(
                Map.of("Холоп 1", 100, "Холоп 2", 20, "Холоп 3", 200)
        );

        final Set<Map.Entry<String, Integer>> entries = customers.entrySet();
        int coffers = 0;

        for (Map.Entry<String, Integer> entry : entries) {
            final Integer wealth = entry.getValue();
            if (wealth > 100) {
                entry.setValue(wealth - 10);
                coffers += 10;
            }
        }

        System.out.println("\nКазна пополнилась на " + coffers + " золотых, Миллорд!");
        System.out.println(customers.values());
    }
}
