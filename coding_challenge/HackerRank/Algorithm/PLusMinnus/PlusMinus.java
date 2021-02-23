
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int poscount = 0;
        int negcount = 0;
        int zerocount = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                poscount++; 
            }else if(arr[i] < 0){
                negcount++;
            }else if(arr[i] == 0){
                zerocount++;
            }
        }
        int n = arr.length ;
            /*
            // using floats also passes all the test cases too
        float a=0f,b=0f,c=0f;
        a = (float)poscount/n;
        b = (float)negcount/n;
        c = (float)zerocount/n;
        */
        double a=0.0,b=0.0,c=0.0;
        a = (double)poscount/n;
        b = (double)negcount/n;
        c = (double)zerocount/n;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f",c);
    }
        /*
        //In JAVASCRIPTS

        length = arr.length;
        arr.forEach( n => {
            if( n > 0 )
                poscount++;
            else if( n < 0 )
                negcount++;
            else
                zerocount++;
        } );
        console.log( (poscount / length).toFixed(6) );
        console.log( (poscount / length).toFixed(6) );
        console.log( (poscount / length).toFixed(6) );
        */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // int[] arr = new int[n];

        // String[] arrItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int arrItem = Integer.parseInt(arrItems[i]);
        //     arr[i] = arrItem;
        // }

        int[] arr = new int[]{ -4, 3, -9, 0, 4, 1}; 

        plusMinus(arr);
        scanner.close();
    }
}

