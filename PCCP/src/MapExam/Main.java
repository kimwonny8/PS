package MapExam;

import java.util.HashMap;
import java.util.Map;
/*
 * Array 장점 + List 장점 => 유연하면서도 빠르게 값을 찾아낼 수 있는
 * Map : Key -> hash function -> hash -> bucket index -> List -> Data
 * 
 * Map<K,V>
 * HashMap - not synch
 * Hashtable - synch
 * ConcurrentHashMap - synch + high concurrency
 * 
 */

class MyData {
	
}

public class Main {
	public static void main(String[] args) {
//		Hashtable<String, Integer> map = new Hashtable<>();
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2); // 값 있어도 덮어 씀
		map.replace("A", 10); // 값 있어도 덮어씀
		map.replace("A", 1, 10); // A가 1이라면 10으로 바꿈
		map.putIfAbsent("C", 10); // 값 없을때만 10이 들어감
		map.remove("B", 3); // B가 3이면 제거 - 출력 값 boolean
		
		method1(map);
	}
	public static void method1(Map<String, Integer> map) {
		System.out.println(map);
		System.out.println(map.get("A")); // 없는 값 출력시 null
		System.out.println(map.getOrDefault("C", -1)); // 없으면 뒤 값 출력
		System.out.println(map.values()); // 값만 출력
		System.out.println(map.keySet()); // 키만 출력
	}
}
