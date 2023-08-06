public class Main3 {
	public static void main(String[] args) {
		int a = 30;
		int sum = solution(a);
		System.out.println(sum);
	}

	public static int solution(int a) {
		int sum = 0;
		for (int i = 2; i <= a; i++) {
			if (isPrime(i))
				sum += i;
		}
		return sum;
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}