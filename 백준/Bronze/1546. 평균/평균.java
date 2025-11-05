import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 과목 개수 입력받기
        int count = sc.nextInt();

        // 점수 입력받을 배열 선언, 점수 입력
        double [] scores = new double[count];
        for(int i = 0; i < count; i++) {
            scores[i] = sc.nextDouble();
        }

        // 점수 중 최대값 구하기
        double max = 0;
        for(int i = 0; i < count; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
        }

        // 최대값 이외의 점수 변환하기
        for(int i = 0; i < count; i++) {
            scores[i] = (scores[i] / max * 100);
        }

        // 새로운 평균 구하기
        double sum = 0;
        for(int i = 0; i < count; i++) {
            sum += scores[i];
        }

        System.out.println(sum / count);
    }
}