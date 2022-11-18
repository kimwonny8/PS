import java.util.Scanner;

public class Main {
	static long A, B;
	static int min, cnt;
	
    static void dfs(long cur, int cnt) {
		if(cur > B) return;
		if(cur == B) {
			min = cnt + 1;
			return;
		}
		dfs(cur * 10 + 1, cnt + 1);
		dfs(cur * 2, cnt + 1);
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		min = -1;
		
		dfs(A, 0);
		System.out.println(min);
	}
}