import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.Random;
public class ex2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        randList(10, 100, list);

        System.out.println(list);

        enqueue(list, 0);
        System.out.println("Помещает элемент в конец очереди: " + list);

        System.out.println("Первый элемент из очереди: " + dequeue( list));
        System.out.println( "Удаляет первый элемент: " + list);

        System.out.println("Первый элемент из очереди: " + first(list));
        System.out.println("Не удаляет его" + list);
    }

    public static void enqueue(LinkedList<Integer> list, int value) {
        list.add(value);
    }

    public static int dequeue(LinkedList<Integer> list) {
        return list.removeFirst();
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }

    public static void randList(int count, int maxValue, LinkedList<Integer> list) {
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            list.add(rand.nextInt(maxValue));
        }
    }
}
