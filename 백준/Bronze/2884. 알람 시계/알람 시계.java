import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt(), m=sc.nextInt();
		m=60*h+m-45;
		if(m<0){
			m=m+1440;}
			System.out.println(m/60+" "+m%60);
	}
}