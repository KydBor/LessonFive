import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonFive {
    public static void main(String[]args) {
/*            int [][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
        */

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] array = new int [] {2, 3, 1, 4, 0, -2};
        for (int i = 0; i < array.length; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array [j - 1] < array [j]){
                    int buf = array [j];
                    array [j] = array [j - 1];
                    array [j - 1] = buf;
                }
            }
        }System.out.println(Arrays.toString(array));
    }
}
