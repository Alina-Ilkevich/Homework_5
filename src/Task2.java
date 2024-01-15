import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i % 2 == 0) && (j % 2 == 0)) {
                    arr[i][j] = "w";
                } else if ((i % 2 == 1) && (j % 2 == 1)) {
                    arr[i][j] = "w";
                } else if ((i % 2 == 0) && (j % 2 == 1)) {
                    arr[i][j] = "b";
                } else if ((i % 2 == 1) && (j % 2 == 0)) {
                    arr[i][j] = "b";
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
