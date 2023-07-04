package ListExam;

import java.util.*;

class Q88733 {
    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=i+1) return false;
        }
        
        return answer;
    }
}