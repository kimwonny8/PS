package ListExam;

import java.util.*;

class Q88732 {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max=arr[i];
        }
        for(int i=0; i<arr.length; i++){
            if(max==arr[i]) answer.add(i);
        }
        
        return answer;
    }
}