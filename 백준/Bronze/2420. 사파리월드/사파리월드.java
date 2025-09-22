import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long seung = sc.nextInt();
		long kyu = sc.nextInt();
		long result = seung - kyu;
		
		if(result < 0) {
			System.out.println(result = -result);
		} else {
			System.out.println(result);
		}
	}
}
