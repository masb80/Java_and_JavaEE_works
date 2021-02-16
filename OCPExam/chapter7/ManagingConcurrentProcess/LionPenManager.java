package OCPExam.chapter7.ManagingConcurrentProcess;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class LionPenManager {

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {       
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
      
    }

    private void addAnimals() {
        System.out.println("adding  animal");
    }

    private void cleanPen() {
        System.out.println("cleaning pen");
    }

    private void removeAnimals() {
        System.out.println("Removing animals");
    }

}
