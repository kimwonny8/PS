class Solution {
    boolean solution(String s) {
        char[] arr = s.toLowerCase().toCharArray();
		
        int p = 0, y = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'p') p++;
			else if(arr[i] == 'y') y++;
		}
        return p == y;
    }
}