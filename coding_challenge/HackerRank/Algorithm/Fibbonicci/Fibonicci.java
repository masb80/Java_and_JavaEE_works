package Fibbonicci;

public class Fibonicci {
    Long fib(int n) {
        System.out.println("fib running  "+ n );
        //int n = 6;
      //  Dynamic programmig method
        Long f[] = new Long[(int) (n+2)];
        f[0] = 0L;
        f[1] = 1L;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i - 2];
        }
        return f[n];

        // Recursive method
        // if (n <= 1)
        //     return n;
        // else{
        //     System.out.println("fib running IN LOOP    "+ n );
        //     return fib(n - 1) + fib(n - 2);
        // }
    }

    public static void main(String[] args) {
        Fibonicci fib = new Fibonicci();
        var fibv = fib.fib(75);
        System.out.println(fibv);
    }
}
