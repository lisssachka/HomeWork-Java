// Считать фразу и переставить слова в обратном порядке.
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите фразу: ");
        String phrase = sc.nextLine();
        sc.close();   
        
        System.out.println(phrase);

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length/2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;

        }
        String out = String.join(" ", words);

        System.out.println(out);
        // System.out.println(out1);
    }
}
