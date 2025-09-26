import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        int [][] arr2 = new int[row][col];
        int [][] arr3 = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
