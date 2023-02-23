//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
import java.util.*;
public class ex2 {
    public static void main(String[] args){
        ArrayList<Integer> intList = new ArrayList<>();
        randList(15, 50, intList);

        printList(", ", intList);

        System.out.println("Max = " + max(intList));
        System.out.println("Min = " + min(intList));
        System.out.println("Avg = " + avg(intList));
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

    public static int max(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
            
        }
        return max;
    }

    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i) < min){
                min = list.get(i);
            }

        }
        return min;
    }

    public static double avg(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double avg = sum / list.size();
        return avg;
    }
}
