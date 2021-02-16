package OCPExam.chapter4.FunctionalInterface;

import java.util.function.Function;

import javax.lang.model.util.ElementScanner6;

public class FunctionalInterface {
    public static void main(String[] args) {
        // Function<String, Integer> function = new Function<String, Integer>(){
        //     @Override
        //     public Integer apply(String t){
        //         return t.length();
        //     }
        // };
        // System.out.println(function.apply("arg0"));        
    //}
    Function<String, Integer> function = (t)->t.length();
    System.out.println(function.apply("arg0"));        
        
        Function<Integer, String> f =(n)->{
            if(n%2 == 0)
                System.out.println("n is even");
            else
                System.out.println("n is odd");
            return null;
        };
        System.out.println(f.apply(50));
    }    
    
}
