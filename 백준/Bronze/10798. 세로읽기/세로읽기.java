import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		char[][] arr=new char[5][15];
	
		for(int i=0; i<5; i++) {
			String str=sc.next();
			for(int j=0; j<15; j++) {
				if(j<str.length()) arr[i][j]=str.charAt(j);
			}
		}
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i]=='\0') continue; 
				sb.append(arr[j][i]); // 세로부터 출력해야하므로 i j 반대
			}
		}
		System.out.println(sb);
		
	}
}
