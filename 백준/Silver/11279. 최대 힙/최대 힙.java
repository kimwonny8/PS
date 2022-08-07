import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		int N=sc.nextInt();
		PriorityQueue <Integer> q=new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙
		while(N-->0) {
			int num=sc.nextInt();
			if(num==0) {
				if(q.isEmpty()) sb.append(0+"\n");
				else sb.append(q.poll()+"\n");
			}
			else q.add(num);
		}
		System.out.println(sb);
	}
}
