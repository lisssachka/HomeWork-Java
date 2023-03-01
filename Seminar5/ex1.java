// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
package Homework.Seminar5;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Map <String, ArrayList<String>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");
        while(true){
            System.out.print("Укажите номер действия:\n 1 Добавление номера \n 2 Вывод телефонной книги\n 0 Выход\n\n Ваш выбор: ");
            String num = sc.nextLine();
            if ("1".equals(num)) add(map, sc);
            else if ("2".equals(num)) show(map);
            else if ("0".equals(num)) break;
                else System.out.print("Ошибка ввода команды!");
        }
        sc.close();
    }
    public static void add(Map<String, ArrayList<String>> map, Scanner sc){
        int index = 1;
        Object[] names = map.keySet().toArray();
        
        System.out.println();
        System.out.println("Выберите, кому добавить номер:");
        for (Object el: names) {
            System.out.println(index + ". " + el);
            index++;
        }

        System.out.print("0. Добавить новый контакт\n Ваш выбор: ");

        int decision = sc.nextInt();
        sc.nextLine();

        if (decision <= names.length && decision > 0) {
            System.out.print("Введите номер телефона: ");
            String phone = sc.nextLine();
            map.get(names[decision - 1]).add(phone);
        }
        else if (decision == 0) {
            System.out.print("Введите ФИО нового контакта: ");
            String name = sc.nextLine();

            System.out.print("Введите номер телефона: ");
            String phone = sc.nextLine();

            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phone);

            map.put(name, numbers);
        }
        else System.out.println("Такого варианта нет!");
    }
    public static void show(Map<String, ArrayList<String>> map){
        System.out.println();

        for (var el: map.entrySet()) {
            System.out.print(el.getKey() + ":");

            for (String in: el.getValue()) System.out.println(in);
        }
    }
}
