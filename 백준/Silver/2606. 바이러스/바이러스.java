import java.util.Scanner;

public class Main {
	static int N, M;
	static int [][] arr;
	static boolean [] chk;
	static int cnt=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt(); M=sc.nextInt();	// 노드 N, 간선 M
		arr=new int[N+1][N+1];
		chk=new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			arr[a][b]=arr[b][a]=1;
		}
		dfs(1);
		System.out.println(cnt-1);
	}
	
	static void dfs(int start) {
		chk[start]=true;
		cnt++;
		
		for(int i=0; i<=N; i++) {
			if(arr[start][i]==1 && !chk[i]) dfs(i);
		}
	}
}