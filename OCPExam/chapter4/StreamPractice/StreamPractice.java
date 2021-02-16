package OCPExam.chapter4.StreamPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//https://www.youtube.com/watch?v=t1-YZ6bF-g0
//https://www.youtube.com/watch?v=VRpHdSFWGPs

public class StreamPractice {
    public static void main(String[] args) {
        IntStream.range(1, 10).skip(5).forEach(System.out::println);
        IntStream.range(1, 10).skip(8).forEach(x -> System.out.println(x));
        System.out.println(IntStream.range(1, 10).sum());
        Stream.of("aaA", "C", "F").sorted().findFirst().ifPresent(System.out::println);
        Arrays.stream(new int[] { 2, 4, 6, 3, 7, 9 }).map(x -> x * x).average().ifPresent(System.out::println);
        List<String> people = Arrays.asList("al", "bb", "fff", "abvch");
        people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);
        // stream rows from a .txt and .csv file
        try {
            Stream<String> rows1 = Files.lines(Paths.get("/home/samad/text1.txt"));
            int rowCount = (int) rows1.map(x->x.split(",")).filter(x->x.length == 3).count();
            System.out.println(rowCount +" rows.");
            rows1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Stream<String> rows2 = Files.lines(Paths.get("/home/samad/text1.txt"));
            rows2.map(x->x.split(",")).filter(x->x.length == 3).filter(x->Integer.parseInt(x[1]) > 15)
            .forEach(x-> System.out.println(x[0]+" ==  "+x[1]));            
            rows2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        double x[] = {2.3,4.6,78.6};
        double total = Stream.of(2.3,4.6,78.6).reduce(0.0,(Double a, Double b) -> a+b);
       // System.out.println("Total  "+total);
        // statistics
        IntSummaryStatistics summary = IntStream.of(2,5,7,1,9,55,66)
                                        .summaryStatistics();
        System.out.println("summary  "+summary); 
       /*
        Stream<Integer>stream = Stream.of(1,2,5);
        System.out.println(stream.reduce(0,(s,n)->s+n));
        System.out.println(stream.mapToInt(x1->x1).sum());
        */
        
        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x12-> x12 + "2"));


    
       
    }    
}
