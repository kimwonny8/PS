import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0; i<5; i++) arr[i]=sc.nextInt();
		
		int num=1;
		while(true) {
			int cnt=0;
			for(int i=0; i<5; i++) {
				if(num%arr[i]==0) cnt++;
			}
			if(cnt>=3) {
				System.out.println(num);
				break;
			}
			num++;
		}
	}

}