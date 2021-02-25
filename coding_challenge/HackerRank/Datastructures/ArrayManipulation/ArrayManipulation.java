package ArrayManipulation;

import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;


public class ArrayManipulation {
      // Complete the arrayManipulation function below.
      static long arrayManipulation(int n, int[][] queries) {
        int queryrowsize = queries.length;
        int [][] arr = new int [queries.length][n];
        for(int i =0; i < queryrowsize; i++){
            for(int j = 0; j < n; j++){
                if(j >= queries[i][0] && j <= queries[i][1] ){
                        arr[i][j] = arr[i][j] + queries[i][2];
                }
            }
        }
        long maxcolTop = 0L;
        for(int i =0; i < arr[0].length; i++){
            long maxcol = 0L;
            for(int j = 0; j < arr.length; j++){                
                maxcol += arr[j][i]; 
                if(maxcol > maxcolTop ){
                    maxcolTop = maxcol;
                }
            }
        }
        return maxcolTop;

        /*
        // this also worked
        
              Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        
        //for index 0 as dummy
        long[] numbers = new long[N+1];
        
        for(int i = 0; i < M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            numbers[a] += k;
            if(b + 1 <= N){
                numbers[b+1] -= k;
            }
        }
        
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 1; i < numbers.length; i++){
            sum = sum + numbers[i];
            if(sum > max){
                max = sum;
            }
        }
        
        System.out.println(max);


        */
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    // String[] nm = new String[2];
    // for(int i =0; i<2;i++){
    //      nm = scanner.nextLine().split(" ");
         
    // }

    // int n = Integer.parseInt(nm[0]); // column or  I need to make an array of that size of column

    // int m = Integer.parseInt(nm[1]); // row / how many queries entered
    int n = 5; // column or  I need to make an array of that size of column

    int m = 3;
    int[][] queries = new int[m][3]; // row = m, column = 3

    for (int i = 0; i < m; i++) {
        //String[] queriesRowItems = scanner.nextLine().split(" ");
      //  String[] queriesRowItems = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int j = 0; j < 3; j++) {
          //  int queriesItem = Integer.parseInt(queriesRowItems[j]);
            queries[i][j] = scanner.nextInt();
        }
    }

    long result = arrayManipulation(n, queries);

   // bufferedWriter.write(String.valueOf(result));
  //  bufferedWriter.newLine();

   // bufferedWriter.close();

    scanner.close();
}  
    
}
