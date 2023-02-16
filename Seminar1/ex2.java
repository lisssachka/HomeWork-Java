// Вывести все простые числа от 1 до 1000
package Homework.Seminar1;

public class ex2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (simple(i))
                System.out.print(i + " ");
        }
   
    }

    public static boolean simple(int num) {
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }
}
