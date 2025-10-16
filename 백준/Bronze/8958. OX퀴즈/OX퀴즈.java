import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            boolean flag = false;
            int sum = 0;
            int score = 0;
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    if (flag) {
                        ++score;
                    } else {
                        score = 1;
                    }
                    sum += score;
                    flag = true;
                } else {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
