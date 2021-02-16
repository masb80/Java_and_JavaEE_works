package OCPExam.chapter7.AmbiguousLambdaExpression;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambdaExpression {
    public static void useCallable(Callable<Integer>expression){ }
    public static void useSupplier(Supplier<Integer>expression){ }
    public static void use(Supplier<Integer>expression){} // ambiguous 
    public static void use(Callable<Integer>expression){} // ambiguous 

    
    public static void main(String[] args) {
        useCallable(() -> {throw new IOException();});
        //useSupplier(() -> {throw new IOException();});
       // use(()-> {throw new IOException()});
        
    }
    
}
