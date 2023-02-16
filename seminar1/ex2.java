// Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1] Вывести максимальное количетсво подряд идущих 1
import java.util.Random;
public class ex2 {
    public static void main(String[] args){
        int[] array = getRandomArray(10, 1);
        showArray(array);
        int count = 1;
        int tempMax = 1;

        for (int i = 1; i < array.length; i++){
            if (array[i] == array[i-1] && array[i] == 1)tempMax++;
                else tempMax = 1;
            if (tempMax > count) count = tempMax;

        }
        System.out.println(count);
    }
    public static int[] getRandomArray(int size,  int maxValue){
        int[] array = new int[size];
        Random rand = new Random();
        for(int i =0; i < size; i++){
            array[i] = rand.nextInt(maxValue);
        }
        return array;
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
