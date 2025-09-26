import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[30];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for(int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            for(int j = 0; j < arr.length; j++) {
                if(n == arr[j]){
                    arr[j] = 0;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
