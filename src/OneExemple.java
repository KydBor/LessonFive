import java.util.Random;
import java.util.Scanner;

public class OneExemple {
    public static void main(String[]args) {
        System.out.println("Размер матрицы: ");
        int q;
        Scanner scanner = new Scanner(System.in);
        q = scanner.nextInt();
        int [][] array = new int[q][q];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }

        int s = 0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                if (i == j && array[i][j] % 2 == 0) {
                    s += array[i][j];
                }
            }
        }
        System.out.println("Сумма чётных чисел главной диагонали: " + s);

        System.out.print("Нечетные элементы главной диагонали и ниже: ");
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j <= i && j <= array[i].length; j++) {
                if(array[i][j] % 2 - 1 == 0){
                    int z = array[i][j];

                    System.out.print(z + " ");
                }
            }
        }

    }
}
