import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();

		if((x+y)%2 != 0 || x<y)	System.out.println(-1);
		else System.out.println(((x+y)/2)+" "+(((x+y)/2)-y));
	}

}