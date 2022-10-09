import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt(), H = sc.nextInt();
		int N = sc.nextInt(); // 점선 개수
		ArrayList<Integer> widthCut = new ArrayList<>();
		ArrayList<Integer> heightCut = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int wh = sc.nextInt();
			int len = sc.nextInt();
			if (wh == 0) { 
				widthCut.add(len);
			} else { 
				heightCut.add(len);
			}
		}
		int maxW = getMaxLen(H, widthCut); // 세로 y축 기준으로 자르기
		int maxY = getMaxLen(W, heightCut); // 가로 x축 기준으로 자르기
		
		System.out.println(maxW * maxY); 
	}

	private static int getMaxLen(int N, ArrayList<Integer> list) { // N은 길이, list는 점선
		int cutCnt = list.size();
		if (cutCnt == 0) { // 한번도 잘리지 않은 경우
			return N;
		}
		
		Collections.sort(list);
		int max = list.get(0); 
		for (int i = 1; i < cutCnt; i++) { 
			max = Math.max(max, list.get(i) - list.get(i - 1));
		}
		max = Math.max(max, N - list.get(cutCnt - 1)); 

		return max;
	}
}