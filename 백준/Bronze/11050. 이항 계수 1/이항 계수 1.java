import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = factorial(n) / (factorial(k) * factorial(n - k));
        System.out.println(result);
    }

    private static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
