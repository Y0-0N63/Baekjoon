import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String result = Integer.toString(a * b * c);

        char results[] = new char[result.length()];
        for (int i = 0; i < result.length(); i++) {
            results[i] = result.charAt(i);
        }

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < results.length; j++) {
                if (results[j] == (char) (i + '0')) {
                    count++;
                }
            }
            map.put(i, count);
        }

        for(Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
