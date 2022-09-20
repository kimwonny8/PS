import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int MAX=1000000;
        boolean[] prime=new boolean[MAX+1];
        
        for(int i=0; i<=MAX; i++) prime[i]=true; 
        for(int i=2; i<=MAX; i++) {
            for(int j=i*2; j<=MAX; j+=i) {
                if(!prime[j]) continue;
                prime[j]=false;
            }
        }
    	
        while(true) {
            int n=sc.nextInt();
            boolean chk=false;
            if(n==0) break;
            for(int i=2; i<=n/2; i++) {
                if(prime[i] && prime[n-i]) {
                    sb.append(n+" = "+i+" + "+(n-i)+"\n");
                    chk=true;
                    break;
                }
            }
            if(!chk)
            	 sb.append("Goldbach's conjecture is wrong.\n");
        }
        System.out.print(sb);
    }
}