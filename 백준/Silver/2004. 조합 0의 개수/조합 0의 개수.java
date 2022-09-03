import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		long n=sc.nextLong(),m=sc.nextLong();
		
		// 0의 개수는 2와 5의 겹치는 승수의 값과 같음
		long cnt5=five(n)-five(n-m)-five(m);
		long cnt2=two(n)-two(n-m)-two(m);
		System.out.println(Math.min(cnt5, cnt2));
	}
	
	static long five(long num) {
		int cnt=0;
		while(num>=5) {
			cnt+=(num/5);
			num/=5;
		}
		return cnt;
	}
	static long two(long num) {
		int cnt=0;
		while(num>=2) {
			cnt+=(num/2);
			num/=2;
		}
		return cnt;
	}
}
