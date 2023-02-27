// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

package Homework.Seminar4;
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        LinkedList<Double> results = new LinkedList<>();
        Scanner sc = new Scanner(System.in, "cp866");

        System.out.print("Введите первое число: ");
        results.add(sc.nextDouble());
        sc.nextLine();

        while(true) {
            System.out.print("Введите оператор или отмену (*, /, +, -, Cancel): ");
            String op = sc.nextLine();

            if ("".equals(op)) break;
            else if ("Cancel".equals(op) || "cancel".equals(op)) {
                results.removeFirst();

                if (results.size() == 0) results.add(0.0);
            }
            else {
                System.out.print("Введите второе число: ");
                double num2 = sc.nextDouble();

                calc(results, op, num2);
                sc.nextLine();
            }

            System.out.println("Результат: " + results.getFirst());
        }

        sc.close();
    }

    public static double calc(LinkedList<Double> list, String op, double num){
        double res = 0;
        if ("+".equals(op)){
            list.add(0, list.getFirst() + num);
            }
        
        else {
                if ("-".equals(op)){
                    list.add(0, list.getFirst() - num);}
            
                    else {
                        if ("*".equals(op)){
                            list.add(0, list.getFirst() * num);}
                    
                            else {
                                if ("/".equals(op)){
                                    list.add(0, list.getFirst() / num);}
                            }
                        }
                 }

                 
            
        return res;
    }
}
