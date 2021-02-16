package OCPExam.chapter4.ImplementSupplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ImplementSupplier {
    // A Supplier is used when uou want to generate or supply values without talking any input. 
//    @FunctionalInterface 
//    public class Supplier<T>{
//         public T get();
//     }

    public static void main(String[] args) {
        // Supplier interface is used for return something with no argument
        // usually use to supply data to other methods
        //https://www.youtube.com/watch?v=twGS0G3y6PY
        Supplier<LocalDate>s1 = LocalDate::now;
        Supplier<LocalDate>s2 =  () -> LocalDate.now();
       // LocalDate d1 = s1.get();
       // LocalDate d2 = s2.get();
        System.out.println(s1.get());
        System.out.println(s2.get());
        Supplier<StringBuilder> s11 = StringBuilder::new;
        Supplier<StringBuilder> s22 = ()-> new StringBuilder("ww");

        System.out.println(s11.get());
        System.out.println(s22.get());
        
        
    }
    
}
