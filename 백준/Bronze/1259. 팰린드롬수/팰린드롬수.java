import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String inputNum = sc.next();
            if (inputNum.equals("0")) break;

            String[] inputArr = new String[inputNum.length()];
            for (int j = 0; j < inputNum.length(); j++) {
                inputArr[j] = inputNum.substring(j, j + 1);
            }

            int k = 0;
            for (k = 0; k < inputArr.length / 2; k++) {
                if (inputArr[k].equals(inputArr[inputArr.length - k - 1])) {
                    continue;
                } else {
                    System.out.println("no");
                    break;
                }
            }

            if (k == inputArr.length/2) {
                System.out.println("yes");
            }
        }
    }
}