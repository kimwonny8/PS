import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int cnt = 0;
		int n = sc.nextInt();

		while (n-- > 0) {
			String str2 = sc.next();
			if (str.equals(str2)) cnt++;
		}
		System.out.print(cnt);
	}
}