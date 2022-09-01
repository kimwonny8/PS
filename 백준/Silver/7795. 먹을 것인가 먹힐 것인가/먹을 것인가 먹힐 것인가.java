import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt(), M=sc.nextInt();
			int []A=new int[N];
			int []B=new int[M];
			
			for(int i=0; i<N; i++) A[i]=sc.nextInt();
			for(int i=0; i<M; i++) B[i]=sc.nextInt();
			
			Arrays.sort(A);
			Arrays.sort(B);
			int cnt=0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(A[i]<=B[j]) break;
					else cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.print(sb);
	}
}
