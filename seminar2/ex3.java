// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите фразу: ");
        String phrase = sc.nextLine();
        sc.close();
        System.out.print(palindrom(phrase));
    }

    public static boolean palindrom(String phrase){
        for (int i = 0; i < phrase.length() / 2; i++){
            if (phrase.charAt(i) != phrase.charAt(phrase.length() - 1 - i)) return false;
        }
        return true;
    }
}
