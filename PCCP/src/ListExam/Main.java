package ListExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/* 2023-07-03
 * 
 * LinkedList
 * List 인터페이스
 * 
 * ArrayList (not synch)
 * Vector (synch) 
*/


class MyData {
	int value;
	
	public MyData(int value) {
		this.value = value;
	}

	static MyData create(int v) {
		return new MyData(v);
	}
	
	@Override
	public String toString() {
		return ""+value;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		MyData myData = (MyData) o;
		return value == myData.value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}

public class Main {
	public static void main(String[] args) {
		List<MyData> list = new LinkedList<>();
		List<MyData> list2 = new Vector<>(); // 벡터형인데, 리스트 형으로도 표현 가능하다. => 다형성
		List<MyData> list3 = new ArrayList<>(10); // resizable list
		list.add(MyData.create(1));
		list.add(MyData.create(2));
		list.add(MyData.create(3));
		
		System.out.println(list);
		System.out.println(list.contains(MyData.create(2)));
		System.out.println(list.indexOf(MyData.create(3))); // contains를 이용해 index 찾으러 가는 것
		method1(list);
		method1(list2);
	}
	
	static void method1(List<MyData> list) {
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}
