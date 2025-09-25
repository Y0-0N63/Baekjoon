import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        if(n >= 1 && n <= 10000 && x >= 1 && x <= 10000) {
            for(int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
