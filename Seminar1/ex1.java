// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Реализовать простой калькулятор (+ - / *)

package Homework.Seminar1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in, "cp866");

    System.out.println("Введите число для вычисления треугольного числа и факториала: ");

    int number = Integer.parseInt(sc.nextLine());
    sc.close();

    System.out.print("Треугольное число: ");
    System.out.println(triangNumber(number));
    System.out.print("Факториал: ");
    System.out.println(factorial(number));

}
public static int triangNumber(int number) {
    if (number < 1) return 0;
    return number + triangNumber(number - 1);
}

public static int factorial(int number) {
    if (number < 2) return 1;
    return number * factorial(number - 1);
}

}
