import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        
        int n=sc.nextInt();
        int []arr=new int[n];
        Stack<Integer> st=new Stack<>();
       
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        
        for(int i=0; i<n; i++) {
        	while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
        		arr[st.pop()]=arr[i];
        	}
        	st.push(i);
        }
        while(!st.isEmpty()) arr[st.pop()]=-1;
        for(int i=0; i<n; i++) sb.append(arr[i]+" ");
        System.out.println(sb);
    }
}    
