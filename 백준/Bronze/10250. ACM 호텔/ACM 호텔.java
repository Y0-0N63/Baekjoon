import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int floor = n % h;
            int num;
            if (floor == 0) {
                floor = h;
                num = n / h;
            } else {
                num = n / h + 1;
            }

            System.out.printf("%d%02d\n", floor, num);
        }
    }
}
