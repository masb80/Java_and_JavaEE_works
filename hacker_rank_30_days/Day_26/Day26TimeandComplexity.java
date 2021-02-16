package hacker_rank_30_days.Day_26;

import java.util.Scanner;

public class Day26TimeandComplexity {

    static void primetest(int n) {
        int i, m, flag = 0;
        m=n/2; 
        if(n> 0){
              if( n == 1){
                  System.out.println("Not prime");
              }else{
                  for(i = 2; i <= m; i++){
                      if(n%i == 0){
                          System.out.println("Not prime");
                          flag = 1;
                          break;
                      }
                  }
                  if(flag == 0){
                      System.out.println("Prime");
                  }
                  
              }
      }
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
          /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
          Your class should be named Solution. */
          int T = scanner.nextInt();
          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          while(T-->0){
            int data=scanner.nextInt();
                primetest(data);
            }  
      
          scanner.close();
    }
    
}
