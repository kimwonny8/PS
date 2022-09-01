import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] arr=new int[N][2];
		for(int i=0; i<N; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		Arrays.sort(arr,(o1, o2)-> {
			if(o1[0]==o2[0]) return o1[1]-o2[1]; // 시작시간 같으면 빨리 끝나는 순서로
			else return o1[0]-o2[0]; // 시작시간 순 정렬
		});
		
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			int start=arr[i][0];
			int end=arr[i][1];
			
			if(!q.isEmpty() && q.peek()<=start) q.poll();
			q.add(end);
		}
		System.out.println(q.size());
	}
}
