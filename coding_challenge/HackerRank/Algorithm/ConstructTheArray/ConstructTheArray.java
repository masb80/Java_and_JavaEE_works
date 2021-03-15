package ConstructTheArray;

public class ConstructTheArray {
    // Complete the equal function below.
    static int equal(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        int second = arr[1];
        int beforeLast = arr[arr.length - 2];

        for (int i = 1; i <= arr.length - 2; i++) {
            arr = swap(arr, i, arr.length - 2);
           // permute(arr, i+1, arr.length - 2);
            // arr = swap(arr,l,i);
        }
        for(int a: arr){
            System.out.println(a);;
        }
        return 2;

    }

    public static int[] swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    // static int permute(int[] arr, int l, int r) 
    // { 
    //     if (l == r) 
    //         System.out.println(str); 
    //     else
    //     { 
    //         for (int i = l; i <= r; i++) 
    //         { 
    //             str = swap(str,l,i); 
    //             permute(str, l+1, r); 
    //             str = swap(str,l,i); 
    //         } 
    //     } 
    // } 

    public static void main(String[] args) {
       // int[] arr = { 2, 2, 3, 7 };
        int[] arr = { 1, 2, 3, 7,8,9 };
        int ways = equal(arr);
        // System.out.println(ways);

    }

}
