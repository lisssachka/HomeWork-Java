// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
package Homework.Seminar5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        Map <String, Integer> employMap = new HashMap<>();
        String[] employArr = {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов"
        };
        for (String el: employArr) {
            String name = el.split(" ")[0];
            
            if (employMap.containsKey(name)) {
                employMap.replace(name, employMap.get(name) + 1);
            }
            else employMap.put(name, 1);
        }
        Map<String, Integer> sortMap = sortMap(employMap);

        System.out.println(employMap);
        System.out.println(sortMap);
       
    }
    public static Map<String, Integer> sortMap(Map<String, Integer> map) {
        Map<String, Integer> sortMap = new LinkedHashMap<>();
        int max = 1;

        for (int value: map.values())
            if (value > max) max = value;

        for (int i = max; i > 0; i--) {
            for (var el: map.entrySet())
                if (map.get(el.getKey()) == i)
                    sortMap.put(el.getKey(), el.getValue());
        }
        return sortMap;
    }
}
