import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		while(true) {
			String a=sc.next(); int sum=1;
			if(a.equals("0")) break;
			char []arr=new char[a.length()];
			for(int i=0; i<arr.length; i++) {
				arr[i]=a.charAt(i);
			}
			
			boolean b=true;
			for(int i=0; i<a.length()-1-i; i++) {
				if(arr[i]!=arr[arr.length-1-i]) {
					b=false;
					break;
				}	
			}
			if(b) System.out.println("yes");
			else System.out.println("no");
		}
	}
}