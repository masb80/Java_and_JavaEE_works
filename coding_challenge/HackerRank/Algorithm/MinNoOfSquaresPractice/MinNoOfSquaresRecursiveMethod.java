package MinNoOfSquaresPractice;

public class MinNoOfSquaresRecursiveMethod {
    /*
     * Minimum number of squares whose sum equals to given number n
     */

    /*
     * Returns count of minimum squares that sum to n
     */
    static int getMinSquares(int n) {
        System.out.println("initially taking n = " + n);
        // base cases
        if (n <= 3) {
            System.out.println("inside base case n = " + n);
            return n;
        }

        // getMinSquares rest of the
        // table using recursive
        // formula
        // Maximum squares required is
        int res = n; // taking initialize as the highest one
        // n (1*1 + 1*1 + ..)

        // Go through all smaller numbers
        // to recursively find minimum
        // for (int x = 1; x <= n; x++)
        // {
        // int temp = x * x;
        // if (temp > n){
        // System.out.println("inside break loop n = "+ n+" , res= "+res+" , temp "+
        // temp);
        // System.out.println("======================================================");
        // break;
        // }
        // else{
        // System.out.println("inside loop before n = "+ n+" , res= "+res+" , x = "+x+"
        // , temp= "+ temp);
        // res = Math.min(res, 1 +
        // getMinSquares(n - temp));
        // System.out.println("inside loop after n = "+ n+" , res= "+res+" , x = "+x+" ,
        // temp= "+ temp);
        // }

        // }
        // better algorithm to understand
        for (int x = 1; x * x <= n; x++) {
            System.out.println("inside loop before n = " + n + "  , res=  " + res + "  ,  x = " + x);

            res = Math.min(res, 1 + getMinSquares(n - (x * x))); // internal residula difference in every steps of the
                                                                 // tree

            System.out.println("inside loop after n = " + n + "  , res=  " + res + "  ,  x = " + x);

        }
        return res;
    }

    public static void main(String[] args) {
        /*
         * Minimum number of squares whose sum equals to given number n
         */
        System.out.println(getMinSquares(10));

    }
}
