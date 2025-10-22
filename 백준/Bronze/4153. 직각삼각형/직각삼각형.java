import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int[] input = {a, b, c};
            Arrays.sort(input);

            if(Math.pow((double) input[2], 2) == (Math.pow((double) input[0], 2) + (Math.pow((double) input[1], 2)))) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
