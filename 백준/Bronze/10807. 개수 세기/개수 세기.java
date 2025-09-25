import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];

        if(n >= 1 && n <= 100) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int v = sc.nextInt();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == v) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
