package Fibbonicci;

public class Fibonicci {
    static int fib(int n) {
        System.out.println("fib running  "+ n );
        // int n = 6;
        // Dynamic programmig method
        // int f[] = new int[n+2];
        // f[0] = 0;
        // f[1] = 1;
        // int dhukche = 0;
        // for (int i = 2; i <= n; i++) {
        // System.out.println("dhukhche "+ dhukche++);
        // f[i] = f[i-1] + f[i - 2];
        // }
        // return f[n];

        // Recursive method
        if (n <= 1)
            return n;
        else{
            System.out.println("fib running IN LOOP    "+ n );
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int fibv = fib(6);
        System.out.println(fibv);
        // }
    }
}
