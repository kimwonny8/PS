import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int F = Integer.parseInt(sc.next());
 
        String x="", y="";
        for(int i=0; i<=9; i++) {
            for(int j=0; j<=9; j++) {
                x = String.valueOf(i);
                y = String.valueOf(j);
                N = N.substring(0, N.length()-2) + x + y;
    
                if(Integer.parseInt(N) % F == 0) {
                    System.out.println(x + y);
                    return;
                }
            }
        }
    }
}