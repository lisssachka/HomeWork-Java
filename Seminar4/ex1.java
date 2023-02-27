//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
import java.util.*;
public class ex1{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        randList(10, 100, list);
        LinkedList<Integer> newLL = reverse(list);

        System.out.println(list.toString());
        System.out.println(newLL.toString());
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> newList = new LinkedList<>();

        for(int i = list.size(); i > 0; i--) newList.add(list.get(i - 1));

        return newList;
    }

    public static void randList(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();
        
        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }
}