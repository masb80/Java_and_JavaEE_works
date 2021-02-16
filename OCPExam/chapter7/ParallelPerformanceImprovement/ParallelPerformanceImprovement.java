package OCPExam.chapter7.ParallelPerformanceImprovement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelPerformanceImprovement {
    public static int processRecord(int input){
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        return input+1;
    }
    public static void pricessAllData(List<Integer>data){
        //data.stream().map(a->processRecord(a)).count(); // regular stream passed 
        data.parallelStream().map(a->processRecord(a)).count(); // parallel stream passed 

    }

    public static void main(String[] args) {
        List<Integer>data = new ArrayList<Integer>();
        for(int i =0; i<4000; i++){
            data.add(i);
        }
        long start = System.currentTimeMillis();
        ParallelPerformanceImprovement.pricessAllData(data);
        double time = (System.currentTimeMillis()-start)/1000.0;
        System.out.println("\nTask completed in: "+time+" seconds");

        // combining results with reduce

        System.out.println(Arrays.asList('w','o','l','f','m','p')
        .stream()
        .reduce("",(c,s1)->c + s1, (s2,s3) -> s2+s3));

    }
}
