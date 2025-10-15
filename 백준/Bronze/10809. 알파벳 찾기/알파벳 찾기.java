import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (char c = 'a'; c <= 'z'; c++) {
            boolean flag = false;

            for(int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)){
                    System.out.print(i + " ");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(-1 + " ");
            }
        }
        sc.close();
    }
}
