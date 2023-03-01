package Homework6;
// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. минимум 5 
// NoteBook notebook1 = new NoteBook 
// NoteBook notebook2 = new NoteBook 
// NoteBook notebook3 = new NoteBook 
// NoteBook notebook4 = new NoteBook 
// NoteBook notebook5 = new NoteBook
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// 4. Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.

// 5. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// Пример: ----->

// приветствие

// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите количество ---> 16
// вывод всех подходящих ноутбуков по параметру

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Huawei", "MateBook D15", "Silver", 15.6, 8, 512, "Windows 11");
        Notebook notebook2 = new Notebook("MSI", "GF76 ", "Black", 17.3, 8, 256, "Без ОС");
        Notebook notebook3 = new Notebook("Asus", "VivoBook", "Black", 15.6, 16, 512, "Без ОС");
        Notebook notebook4 = new Notebook("MSI", "Modern 15", "White", 15.6, 8, 256, "Windows 10");
        Notebook notebook5 = new Notebook("Huawei", "MateBook D16", "Silver", 16, 16, 1024, "Windows 11");
        Notebook notebook6 = new Notebook("MSI", "Raider GE66", "White", 15.6, 16, 1024, "Windows 11");
        Notebook notebook7 = new Notebook("Asus", "Laptop 15", "Black", 15.6, 4, 256, "Без ОС");

        List<Notebook> notebookList = List.of(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6,
                notebook7);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println(
                "Выберите параметр для поиска, где:\n1 - по ОЗУ\n2 - по объёму ЖД\n3 - по ОС\n4 - по цвету\nВаш выбор: ");
        int num = scannerUser.nextInt();
        Scanner sc = new Scanner(System.in);
        switch (num) {
            case 1:
                System.out.println("Выберите размер ОЗУ, где:\n1 - 4 Гб\n2 - 8 Гб\n3 - 16 Гб\nВаш выбор: ");
                String ozu = sc.nextLine();
                switch (ozu) {
                    case "1":
                        for (Notebook el : notebookList) {
                            if (el.getRam() == 4)
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "2":
                        for (Notebook el : notebookList) {
                            if (el.getRam() == 8)
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "3":
                        for (Notebook el : notebookList) {
                            if (el.getRam() == 16)
                                System.out.println(el.printInfo());
                        }
                        break;
                    default:
                        System.out.println("Выберите значение из списка");
                }
                break;

            case 2:
                System.out.println("Выберите размер ЖД, где:\n1 - 256 Гб\n2 - 512 Гб\n3 - 1024 Гб\nВаш выбор: ");
                String sizeHdd = sc.nextLine();
                switch (sizeHdd) {
                    case "1":
                        for (Notebook el : notebookList) {
                            if (el.gethdd() == 256)
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "2":
                        for (Notebook el : notebookList) {
                            if (el.gethdd() == 512)
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "3":
                        for (Notebook el : notebookList) {
                            if (el.gethdd() == 1024)
                                System.out.println(el.printInfo());
                        }
                        break;
                    default:
                        System.out.println("Выберите значение из списка");
                        break;
                }
                break;
            case 3:
                System.out.println("Выберите ОС, где:\n1 - Без ОС\n2 - Windows 10\n3 - Windows 11\nВаш выбор: ");
                String os = sc.nextLine();
                switch (os) {
                    case "1":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("Без ОС"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "2":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("Windows 10"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "3":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("Windows 11"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    default:
                        System.out.println("Выберите значение из списка");
                        break;
                }
                break;
            case 4:
                System.out.println("Выберите цвет, где:\n1 - White\n2 - Silver\n3 - Black\nВаш выбор: ");
                String color = sc.nextLine();
                switch (color) {
                    case "1":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("White"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "2":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("Silver"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    case "3":
                        for (Notebook el : notebookList) {
                            if (el.getOs().equalsIgnoreCase("Black"))
                                System.out.println(el.printInfo());
                        }
                        break;
                    default:
                        System.out.println("Выберите значение из списка");
                        break;
                }
                sc.close();
        }
        scannerUser.close();
    }

}