import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0; i<a; i++) set.add(sc.nextInt());
		for(int i=0; i<b; i++) {
			int tmp=sc.nextInt();
			if(set.contains(tmp)) set.remove(tmp);
			else set.add(tmp);
		}
		System.out.println(set.size());
	}
}