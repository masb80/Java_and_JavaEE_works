package OCPExam.chapter4.ComsumerAndBiconsumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ComsumerAndBiconsumer {

    // @FunctionalInterface
    // public class Consumer<T>{
    // void accept(T t);
    // }
    // @FunctionalInterface
    // public class BiConsumer<T, U>{
    // void accept(T t, U u);
    // }
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("t");
        c2.accept("t");
        c1.andThen(c2).accept("last value");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("t1", 1);
        b2.accept("t", 4);

        System.out.println(map);
        List<Integer> integer = Arrays.asList(1, 3, 5, 7, 2);
        //Consumer<Integer> con = (t)-> System.out.print(t +"  ");
        //integer.forEach(con);
       // integer.stream().sorted().forEach(con);
        integer.forEach((t)-> System.out.print(t +"  "));
        
    }
    
}
