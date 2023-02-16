// Реализовать простой калькулятор (+ - / *)

package Homework.Seminar1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        System.out.print("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.print("Введите действие: ");
        char action = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = sc.nextDouble();

        sc.close();
        double res = calc(num1, action, num2);

        System.out.print(num1 + " " + action + " " + num2 + " = " + res);

    }

    public static double calc(double num1, char action, double num2){
        double res = 0;
        if (action == '+'){
            res = num1 + num2;}
        
        else {
                if (action == '-'){
                    res = num1 - num2;}
            
                    else {
                        if (action == '*'){
                            res = num1 * num2;}
                    
                            else {
                                if (action == '/'){
                                    res = num1 / num2;}
                            }
                        }
                 }

                 
            
        return res;
    }
}