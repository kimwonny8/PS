import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map=new HashMap<>();
        for(int i=0; i<participant.length; i++)  {
			String name=participant[i];
			map.put(name, map.getOrDefault(name, 0)+1);
		}
         for(int i=0; i<completion.length; i++)  {
			String name=completion[i];
			map.put(name, map.get(name)-1);
		}
        for(String key :map.keySet()) 
			if(map.get(key)==1) answer=key;	
		
        
        return answer;
    }
}