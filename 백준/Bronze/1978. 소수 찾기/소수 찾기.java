import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        // 소수 찾기
        int i = 0;
        int amount = 0;
        while(i < n) {
            // 숫자가 1 이하인 경우
            if(nums[i] <= 1) {
                i++;
                continue;
            } else {
                // 숫자가 2 이상인 경우
                int j = 2;
                while(j < nums[i]) {
                    // 나누어 떨어진다면 > 자기 자신 외의 약수가 존재 > 소수가 아님
                    if (nums[i] % j == 0) {
                        // > while문 종료
                        break;
                    }
                    j++;
                }

                // 자기 자신만을 약수로 가진다면
                if (j == nums[i]) {
                    amount++;
                }

                i++;
            }
        }
        System.out.println(amount);
        sc.close();
    }
}
