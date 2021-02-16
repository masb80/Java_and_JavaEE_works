package OCPExam.chapter7;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class ThreadExample {

    // way 1 as thread
    public static class MyThread extends Thread {
        public void run() {
            System.out.println("1st way My thread running");
            System.out.println("1st way My thread finished");
        }
    }

    // way 2 as thread
    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("2nd way My thread in MyRunnable running");
            System.out.println("2nd way My thread in MyRunnable finished");
        }
    }

    // stoppable and runnable in thread
    public static class StoppableRunnable implements Runnable {
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        @Override
        public void run() {
            System.out.println("StoppabeRunnable running");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println(" ... ");
            }
            System.out.println("StoppabeRunnable running stop");

        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) {
        /*
         * MyThread myThread = new MyThread(); myThread.start(); Thread myrunnable = new
         * Thread(new MyRunnable()); myrunnable.start(); // 3rd way Runnable runnable =
         * new Runnable(){
         * 
         * @Override public void run(){ System.out.println("3rd way start");
         * System.out.println("3rd way finish"); } }; Thread thread = new
         * Thread(runnable); thread.start();
         * 
         * // 4th way Runnable runnablel = () -> {
         * System.out.println("4th way lambda expression start");
         * System.out.println("4th way lambda expression finish");
         * 
         * }; Thread threadl = new Thread(runnablel); threadl.start();
         * 
         * // 6th way Runnable runnablel1 = () -> { String threadName =
         * Thread.currentThread().getName(); System.out.println(threadName+
         * "   is running ");
         * 
         * }; Thread threadl1 = new Thread(runnablel1,
         * "The Thread 1, no confirmation that which one will be first  ");
         * threadl1.start(); Thread threadl2 = new Thread(runnablel1,
         * "The Thread 2, no confirmation that which one will be first ");
         * threadl2.start();
         * 
         * // 7th way Runnable runnable1 = () -> { String threadName =
         * Thread.currentThread().getName(); System.out.println(threadName+
         * "   is running "); try{ Thread.sleep(2000); }catch(InterruptedException e){
         * e.printStackTrace();
         * 
         * } System.out.println(threadName+ "  finished");
         * 
         * }; Thread thread1 = new Thread(runnable1,
         * "The Thread 1, no confirmation that which one will be first  ");
         * thread1.start(); Thread thread2 = new Thread(runnable1,
         * "The Thread 2, no confirmation that which one will be first ");
         * thread2.start();
         * 
         */
        // stoppable and runnable in thread
        /*
         * StoppableRunnable stoppableRunnable = new StoppableRunnable(); Thread thread4
         * = new Thread(stoppableRunnable, "The Thread"); thread4.start(); // run method
         * calls try { Thread.sleep(5000); // this thread is the main class thread }
         * catch (InterruptedException e) { e.printStackTrace(); }
         * System.out.println("requesting stop"); stoppableRunnable.requestStop();
         * System.out.println("stop requested");
         * 
         * }
         */

        // ExecutorService practice
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor(); // single thread execution
            System.out.println("begin");
            service.execute(() -> System.out.println("printing zoo"));
            service.execute(() -> {
                for (int i = 0; i < 10; i++)
                    System.out.println("printing zoo inside  " + i);
            });
            service.execute(() -> System.out.println("printing zoo last "));
            System.out.println("end !");
        } finally {
            if (service != null) {
                System.out.println("shutdown !");
                service.shutdown();
            }
            // without below code the code end and shutdown but still inside to the loop works. But when added this, first finish the loop and then end and then shutdown. 
            if (service != null) {
                try {
                    service.awaitTermination(2, TimeUnit.MINUTES);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(service.isTerminated()){
                    System.out.println("All task are finished.");
                }else{
                    System.out.println("At least one task is still running.");
                }
            }

            
               
        }
    }
}
