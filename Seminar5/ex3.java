// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
package Homework.Seminar5;

public class ex3 {
    public static void main(String[] args) {
        int[] queens = new int[8];

        setPos(queens, 0);

        for (int row = 0; row < queens.length; row++) {
            for (int col = 0; col < queens.length; col++) {
                if (queens[row] == col) System.out.print(" X ");
                else System.out.print(" 0 ");
            }

            System.out.println();
        }
    }

    public static boolean setPos(int[] array, int row) {
        if (row == array.length) return true;

        for (int i = 0; i < array.length; i++) {
            boolean flag = true;

            for (int j = 0; j < row; j++) {
                if (array[j] == i || array[j] == i - row + j || array[j] == i + row - j) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                array[row] = i;

                if (setPos(array, row + 1)) return true;
            }
        }

        return false;
    }
}