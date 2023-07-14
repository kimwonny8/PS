package StackQueueExam;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * Queue: offer, poll, peek : 들어간 순서대로
 * Stack: push,  pop,  peek : 들어간 반대로
 * Deque: offerFirst, offerLast : 양방향
 */
public class Main {
	public static void main(String[] args) {

		// list로 구현
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.remove(0)); // Queue의 꺼내기
		System.out.println(list.remove(list.size() - 1)); // Stack의 꺼내기
		System.out.println(list);

		// Interface Queue
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek()); // 꺼내지않고 확인만 하는 것

		// Class Stack
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		// Interface Deque
		Deque<Integer> deque = new LinkedList<>();
		deque.offerFirst(1);
		deque.offerLast(2);
		deque.offerFirst(3);
		deque.offerLast(4);
		System.out.println(deque); // 3, 1, 2, 4
		System.out.println(deque.pollFirst()); // 3
		System.out.println(deque.pollLast()); // 4
	}
}
