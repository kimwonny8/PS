import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1; i<2*n+1; i++){
            for(int j=i; j<i+n; j++){
              if(j%2==0) System.out.print(" ");
              else System.out.print("*");
            }
            System.out.println();
        }
    }
}