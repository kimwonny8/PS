class Solution {

	public int solution(int[] arr) {

		int answer = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				answer += getLcm(arr[i], arr[j]);
			}
		}
		return answer;
	}

	public static int getLcm(int a, int b) {
		return a * b / getGCD(a, b);
	}

	public static int getGCD(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}