import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
    
    }
} 
    
