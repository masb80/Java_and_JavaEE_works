package LoopsI;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LoopsI {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(2 <= N && N <= 20 ){
            int i;
            for(i=1; i < 11; i++){
                System.out.println(N +" x "+ i +" = "+ N * i);
            }
        }
        scanner.close();
    }
}
