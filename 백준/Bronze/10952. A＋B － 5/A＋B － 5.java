import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[0];
        int i = 0;

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) {
                break;
            }

            if(a > 0 && a < 10 && b > 0 && b < 10) {
                if (i == arr.length){
                    int newArr[] = new int[arr.length + 1];
                    for(int j = 0; j < arr.length; j++) {
                        newArr[j] = arr[j];
                    }
                    arr = newArr;
                }
                arr[i] = a + b;
                i++;
            }
        }

        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
