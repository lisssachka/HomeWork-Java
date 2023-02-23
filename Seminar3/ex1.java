// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        randList(15, 50, intList);

        printList(", ", intList);

        removeEven(intList);
        printList(", ", intList);
    }
    public static void removeEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void printList(String el, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i));
                break;
            }
            System.out.print(list.get(i) + el);
        }
    }

    public static void randList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }
    
}
