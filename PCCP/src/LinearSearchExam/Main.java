package LinearSearchExam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* 
* search 는 indexOf, contains, remove 같은 곳에서 이미 구현되어 있습니다. : 완전 탐색
* equals 가 제공될 필요가 있다.
* 
* 이진 탐색: Collections.binarySearch
* Comparable 가 구현되어 있어야 한다.
* 순서대로 정렬되어 있어야 한다.
*/


class MyData implements Comparable<MyData> {
	int v;
	
	public MyData(int v) {
		this.v = v;
	}

	static MyData create(int v) {
		return new MyData(v);
	}
	
	@Override
	public String toString() {
		return ""+v;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		MyData myData = (MyData) o;
		return v == myData.v;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(v);
	}

	@Override
	public int compareTo(MyData o) {
		// 1 == 1 : 1 - 1 = 0 이면 같다
		// 1 ? 2 : 1 - 2 == 0 : 같다
		//				  < 0 : 오른쪽것이 크다
		//				  > 0 : 왼쪽것이 크다
		
		return v - o.v;
	}
}

public class Main {

	public static void main(String[] args) {
		List<Integer> list2 = new LinkedList<>();
		
		for(int i=1; i<=100; i++) list2.add(i);
		System.out.println(list2);
		
		int index = list2.indexOf(63); // indexOf에 선형탐색으로 정의되어있음
		System.out.println(index);
		
		// MyData
		List<MyData> list = new LinkedList<>();
		
		for(int i=1; i<=100; i++) list.add(new MyData(i));
		System.out.println(list);
		
		index = list.indexOf(new MyData(63));
		System.out.println(index);
		
		
		index = Collections.binarySearch(list, new MyData(63));
		System.out.println(index);
	}

}
