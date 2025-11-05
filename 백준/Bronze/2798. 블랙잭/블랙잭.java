import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // n장의 카드 입력받아 > 배열에 저장하기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];
        for(int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        // 세 장의 합이 m 이하이며 최대로 m과 가까운 합 찾기
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < (cards.length - 2); i++) {
            for(int j = i + 1; j < (cards.length - 1); j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    currentSum = (cards[i] + cards[j] + cards[k]);
                    if (currentSum == m) {
                        maxSum = currentSum;
                        System.out.println(maxSum);
                        return;
                    } else  if (currentSum < m) {
                        if (maxSum < currentSum) {
                            maxSum = currentSum;
                        }
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}
