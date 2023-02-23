import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

//* Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

public class ex1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(ex1.class.getName());

        FileHandler fh = new FileHandler();
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        logger.log(Level.INFO,"Test");

        int[] sortArray = new int[] {15, 21, 5, 23, 1, 65, 78, 14};
        System.out.println(Arrays.toString(sortArray));

        bubbleSort(sortArray, logger);
        System.out.println(Arrays.toString(sortArray));
    }

    public static void bubbleSort(int[] array, Logger log) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    log.info(Arrays.toString(array));
                }
            }
        }
    }
}