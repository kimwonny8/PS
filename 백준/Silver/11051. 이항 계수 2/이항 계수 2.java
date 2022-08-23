import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt();
		int [][]arr=new int[N+1][N+1];
		
		// 파스칼의 삼각형 nCr = n-1Cr-1 + n-1Cr
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				if(i==j || j==0) arr[i][j]=1;
				else arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%10007;
			}
		}
		System.out.println(arr[N][K]);
	}
}