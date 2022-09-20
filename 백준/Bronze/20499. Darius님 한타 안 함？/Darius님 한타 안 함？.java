import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String[]arr=a.split("/");
		int[] result = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			result[i]= Integer.parseInt(arr[i]);
		}
		if(result[0]+result[2]<result[1] || result[1]==0) System.out.println("hasu");
		else System.out.println("gosu");
	}
}