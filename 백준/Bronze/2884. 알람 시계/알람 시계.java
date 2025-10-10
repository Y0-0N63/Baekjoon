import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            m -= 45;

            if (m < 0){
                h--;
                m += 60;

                if(h < 0){
                    h = 23;
                }
            }
        }
        System.out.println(h + " " + m);
    }
}
