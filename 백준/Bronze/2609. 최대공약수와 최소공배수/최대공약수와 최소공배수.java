import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        int tmp = 0;
        while (b != 0) {
            tmp = a;
            a = b;
            b = tmp % a;
        }
        System.out.println(a);

        int lcm = originalA * originalB / a;
        System.out.println(lcm);
    }
}
