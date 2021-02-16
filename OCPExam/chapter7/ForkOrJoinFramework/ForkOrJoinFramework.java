package OCPExam.chapter7.ForkOrJoinFramework;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkOrJoinFramework extends RecursiveAction {
    private int start;
    private int end;
    private Double[] weights;
    public ForkOrJoinFramework( Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }
    @Override
    protected void compute(){
        if(end-start <= 3) {
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal weight:  " + i);
            }
        } else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start= "+start+", middle= "+middle+", end= "+end+"]");
            invokeAll(new ForkOrJoinFramework(weights, start, middle),
                new ForkOrJoinFramework(weights, middle, end)
            );
        }
    }
    public static void main(String[] args) {
        Double[] weights = new Double[10]; 
        // let 10 animal in zoo, 
        //a single person can weight at most 3 animals in an hour
        // one worker make task half and divide 5 and 5 task
        // then one zoo worker can weight at most 3 animals
        ForkJoinTask<?> task = new ForkOrJoinFramework(weights, 0, weights.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        System.out.println();
        System.out.println("Weights:  ");
        Arrays.asList(weights).stream().forEach(d->System.out.print(d.intValue()+"  "));
    }
}
