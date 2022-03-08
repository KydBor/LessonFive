import java.util.Random;
import java.util.Scanner;

public class OneExemple {
    public static void main(String[]args) {
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
        System.out.println("Сумма чётных чисел главной диагонали" + s);

        int z = array.length -1;
        int i = 0;
        int j = 0;


        for (i = 0; i >= 0; i--) {
            System.out.print(array[i][j] + " ");
        }
        for (j = z; j >= 0; j--) {
            System.out.print(array[i][z - i] + " ");

        }



    }
}
