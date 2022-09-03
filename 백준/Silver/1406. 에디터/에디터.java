import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String n=sc.next();
		int m=sc.nextInt();
		
		Stack<String> left=new Stack<>();
		Stack<String> right=new Stack<>();
		
		for(int i=0; i<n.length(); i++) {
			left.push(n.substring(i,i+1));
		}
		
		for(int i=0; i<m; i++) {
			String str=sc.next();
			switch(str) {
			case "L": // 커서를 왼쪽으로 한 칸 
				if(!left.isEmpty()) right.push(left.pop());
                break;
            case "D": // 커서를 오른쪽으로 한 칸 
                if(!right.isEmpty()) left.push(right.pop());
                break;
            case "B": // 커서 왼쪽에 있는 문자를 삭제
                if(!left.isEmpty()) left.pop();
                break;
            case "P": // 문자를 커서 왼쪽에 추가
                left.push(sc.next());
                break;
			}	
		}
		//오른쪽 스택에 왼쪽 스택 옮기기
		while(!left.isEmpty()) right.push(left.pop());

        while(!right.isEmpty()) sb.append(right.pop());
        System.out.println(sb);	
   }
}
