package Sort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
* 왜 종류별로 알고리즘을 학습해야 하나?
*  
* 1. 다양한 알고리즘을 학습하면서 문제풀이의 접근방식을 학습할 수 있습니다.
* 2. 문제를 해결하는 알고리즘은 한가지가 아니구나! 효율성이 달라지는 구나! 절대적인 것은 없구나!
*/

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();

		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			list.add(r.nextInt(50));
		}

		list.sort(Comparator.naturalOrder()); // 오름차순 정렬
		list.sort(Comparator.reverseOrder()); // 내림차순 정렬

		// 오름차순 정렬
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() - o2.intValue();
			}
		});

		// 내림차순 정렬
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(list);

	}

}
