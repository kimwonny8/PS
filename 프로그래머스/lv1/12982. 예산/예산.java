import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        int cnt=0;
        for(int i=0; i<d.length; i++){
            cnt+=d[i];
            if(cnt>budget) break;
            else answer++;
        }
        return answer;
    }
}