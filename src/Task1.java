import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество столбцов массива: ");
        int column = scan.nextInt();
        int [][] arr = new int[2][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        scan.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] + a;
            }
        }
        System.out.println("Полученный массив:\n" + Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print("Сумма всех элементов массива: " + sum);
    }
}
