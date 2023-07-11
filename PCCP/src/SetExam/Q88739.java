package SetExam;

import java.util.HashSet;

class Q88739 {
    public boolean solution(String[] words) {
        HashSet<String> set = new HashSet<>();
        int len = words.length;
        
        for (int i = 0; i < len; i++) {
            set.add(words[i]);
            if(i != len-1) {
                String str1 = words[i];
                String str2 = words[i + 1];
                if (str1.charAt(str1.length() - 1) != str2.charAt(0)) return false;
            }
        }
        
        if (set.size() != len) return false;        
        return true;
    }
}