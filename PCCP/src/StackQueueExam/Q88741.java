package StackQueueExam;

import java.util.Stack;

class Q88741 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch=='(') stack.push(ch);
            else if(ch==')') {
                if (stack.isEmpty()) return false;  
                stack.pop();
            }
        }
		return stack.isEmpty();
	}
}