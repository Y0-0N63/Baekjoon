    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException {
            // 빠른 입출력을 위해 BufferedReader로 입력받기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            // 테스트 케이스 입력받기
            int n = Integer.parseInt(br.readLine());

            // 오름차순 정렬 위해 list로 입력받기
            List<Integer> nums = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                nums.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(nums);

            for(Integer num : nums) {
                sb.append(num+"\n");
            }

            System.out.println(sb);
        }
    }
