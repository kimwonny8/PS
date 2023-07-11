package SetExam;

import java.util.HashSet;

class Q88738 {
    public boolean solution(int[] lotto) {
        boolean answer = true;
        HashSet<Integer> set = new HashSet<>();
        for(int num : lotto) {
            set.add(num);
        }
        answer = set.size() == 6 ? true : false;
        return answer;
    }
}