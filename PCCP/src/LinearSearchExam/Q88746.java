package LinearSearchExam;

public class Q88746 {
	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean answer = true;
		char[] arr = s.toLowerCase().toCharArray();
		
		int p = 0, y = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 'p') p++;
			else if(arr[i] == 'y') y++;
		}
		
		answer = p == y ? true : false;
	
		System.out.println(answer);
	}
}
