import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    	List<Map<String, Integer>> answers = new ArrayList<>();
    	
    	answers.add(Map.of("answer", 1, "score", 5));
        answers.add(Map.of("answer", 5, "score", 5));
        answers.add(Map.of("answer", 2, "score", 4));
    	
        Map<String, Integer> scores = new HashMap<>();
        scores.put("a", 0);
        scores.put("b", 0);
        scores.put("c", 0);
        
        for (Map<String, Integer> answer: answers) {
            int answerNum=answer.get("answer");
            int score=answer.get("score");

            if(answerNum==1) scores.put("a", scores.get("a")+score);
            else if(answerNum==3) scores.put("b", scores.get("b")+score);
            else if(answerNum==5) scores.put("c", scores.get("c")+score);
        }
        
        int max=0;
        for(int s: scores.values()) {
        	max=Math.max(max, s);
        }
        
    	int cnt=0;
        for(Map.Entry<String, Integer> entry : scores.entrySet()) {
        	String name=entry.getKey();
            int score=entry.getValue();

            if(score==max && cnt==0) {
            	System.out.print(name+":"+score);
            	cnt++;
            }
            else if(score==max) {
            	System.out.print(", "+name+":"+score);
            }
        }
    }
}
