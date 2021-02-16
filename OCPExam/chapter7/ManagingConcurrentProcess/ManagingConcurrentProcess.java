package OCPExam.chapter7.ManagingConcurrentProcess;

import java.util.concurrent.*;

public class ManagingConcurrentProcess {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,
            () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }
        } finally {
            if (service != null)
                service.shutdown();
               
        }        
    }

}
