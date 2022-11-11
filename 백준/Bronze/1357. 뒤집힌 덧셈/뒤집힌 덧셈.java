import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        
        n = reverse(n);
        m = reverse(m);
        
        int result = reverse(n + m);
        System.out.println(result);
    }
 
    private static int reverse(int N) {
        String str = "";
        while (N > 0) {
            str += N % 10;
            N /= 10;
        }
        return Integer.parseInt(str);
    }
}