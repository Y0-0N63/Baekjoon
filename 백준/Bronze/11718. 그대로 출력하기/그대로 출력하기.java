import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String result = "";

        while(sc.hasNext()) {
            String input = sc.nextLine();
            result += input + "\n";
        }

        if(result.length() > 0) {
            System.out.println(result.substring(0, result.length() - 1));
        }

        sc.close();
    }
}
