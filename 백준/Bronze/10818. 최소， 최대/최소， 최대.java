import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
