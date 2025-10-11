import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String trimmedStr = str.trim();

        if (trimmedStr.isEmpty()){
            System.out.println(0);
            return;
        }

        String [] words = trimmedStr.split(" ");
        System.out.println(words.length);
    }
}
