package SetExam;

import java.util.ArrayList;
import java.util.List;

class Q88740 {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }

        list.add(arr[arr.length - 1]);
        
        return list;
    }
}
