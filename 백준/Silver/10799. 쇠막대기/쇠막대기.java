import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Stack<Integer> stack=new Stack<>();
		
		int cnt=0;
		for(int i=0; i<str.length(); i++) {		
			if(str.charAt(i)=='(') stack.push(i);
			else {
				stack.pop();
				if(str.charAt(i-1)=='(') cnt+=stack.size();
				else cnt++;
			}
		}
		System.out.println(cnt);
	}
}