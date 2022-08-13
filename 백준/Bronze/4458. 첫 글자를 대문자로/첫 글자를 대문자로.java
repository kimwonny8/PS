import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int N=Integer.parseInt(sc.nextLine());
		while(N-->0) {
			String str=sc.nextLine();
			sb.append(str.substring(0,1).toUpperCase()+str.substring(1)+"\n");
		}
		System.out.print(sb);
	}
}