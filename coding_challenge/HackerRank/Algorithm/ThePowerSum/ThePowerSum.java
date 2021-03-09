package ThePowerSum;

public class ThePowerSum {
   // static int powerSum(int X, int N)
   // X = targeted amount, N = Power
    static int powerSum(int X, int N)
    {
        int upto = (int) (Math.pow(X, 1.0/N)) +1;
        System.out.println("X =  "+X+ "   upto   "+ upto+"   N   "+N);
        int[] arr = new int[X+1];
        arr[0] = 1;
        for(int i = 1; i <= upto; ++i){
            int pow = (int)Math.pow(i, N);
            for(int j = X; j >= pow; j--){                
                arr[j] += arr[j-pow];
                System.out.print(arr[j]+"  ");
            }
            System.out.println();
        }
        return arr[X];
    }
   
    // Driver code
    public static void main(String args[])
    {
        System.out.println(powerSum(7, 2));
    }
    
}
