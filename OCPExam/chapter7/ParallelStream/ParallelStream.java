package OCPExam.chapter7.ParallelStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStream {
    
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,3,5,66,7,8).stream();
        Stream<Integer> parallelStream = stream.parallel();

        Stream<Integer> parallelStream2 = Arrays.asList(3,4,6,77,88).parallelStream();

       parallelStream2.forEachOrdered((a)-> System.out.print(a+"  "));

    }
    
}
