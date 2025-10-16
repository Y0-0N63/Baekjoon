import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums =  new int[10];
        Set<Integer> remains = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remain = num % 42;
            remains.add(remain);
        }

        System.out.println(remains.size());
    }
}
