import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i]=i;
			for(int j=1; j*j<=i; j++) {
				if(arr[i] > arr[i-j*j]+1) {
					arr[i]=arr[i-j*j]+1;
				}
			}
		}
		System.out.println(arr[n]);
		
	}
}