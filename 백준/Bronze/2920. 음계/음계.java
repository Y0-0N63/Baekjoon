import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scales = new int[8];
        for (int i = 0; i < 8; i++) {
            scales[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < 8; i++) {
            if (scales[i - 1] < scales[i]) {
                descending = false;
            } else if (scales[i - 1] > scales[i]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
