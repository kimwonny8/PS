package StackQueueExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q88742 {
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
        for(int i=0; i<progresses.length; i++){
            int n1 = 100 - progresses[i];
            int n2 = n1 / speeds[i];
            if(n1 % speeds[i] != 0) n2++;
            
            queue.add(n2);
        }

        int cnt = 0;
        int top = queue.peek();
        while (!queue.isEmpty()) {
            if (queue.peek() <= top) {
                queue.remove();
                cnt++;
            } else {
                list.add(cnt);
                cnt = 0;
                top = queue.peek();
            }
        }
        list.add(cnt);

        System.out.println(list);
	}
}
