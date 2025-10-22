import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tShirts = new int[6];

        // 티셔츠 사이즈별 신청자 수 입력받기
        for(int i = 0; i < tShirts.length; i++) {
            tShirts[i] = sc.nextInt();
        }

        // 티셔츠의 묶음 수
        int t = sc.nextInt();

        // 펜의 묶음 수
        int p = sc.nextInt();

        // 티셔츠를 t장씩 최소 몇 묶음 주문해야 하는지
        int tSum = 0;
        for(int i = 0; i < tShirts.length; i++) {
            if(tShirts[i] % t == 0) {
                tSum += (tShirts[i] / t);
            } else {
                tSum += (tShirts[i] / t + 1);
            }
        }
        System.out.println(tSum);

        // P자루씩 최대 몇 묶음 주문할 수 있는지와,펜을 한 자루씩 몇 개 주문하는지
        int pSum = n / p;
        int pIndv = n % p;
        System.out.println(pSum + " " + pIndv);
    }
}