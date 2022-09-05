import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt(); 
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < t; i++) {
         int n = sc.nextInt();
         int [] arr = new int[n+1];
         int max = -1001;
         
         for (int j = 1; j <arr.length ; j++) {
            int sum = sc.nextInt();
            arr[j] = arr[j-1] + sum;
            max = Math.max(max,Math.max(sum, arr[j]));
         }
         
         for (int k = 1; k <= n ; k++) {
                for (int j = k+1; j <= n; j++) {
                    max = Math.max(max, arr[j]-arr[k]);
                }
            }
         sb.append(max+"\n");
      }
      System.out.println(sb);
}
}