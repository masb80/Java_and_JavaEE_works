package OCPExam.chapter7.SynchronizingDataAccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.*;

public class SynchronizingDataAccess {
   /*
    // using atomic integer
    // atomic will make successive or single thread one by one
    private AtomicInteger sheepCount = new AtomicInteger(0);
    private void incrementAndReport(){
        System.out.println(sheepCount.incrementAndGet()+"  ");
    }
    */
    
   private int sheepCount = 0;
  // private final Object lock = new Object();
    private synchronized void incrementAndReport(){ // synchronized inside and in method are same
       // synchronized(this){ // alternative of atomicInteger
      //  synchronized(lock){ // alternative of atomicInteger
            System.out.println((++sheepCount)+"  ");
       // }
    }
    
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(20);  // 
            SynchronizingDataAccess manager = new SynchronizingDataAccess();
          //  synchronized(manager){ // this condition is same as atomic, work to be completed by one thread at a time
                for(int i =0; i<10; i++){
                    service.submit(()-> manager.incrementAndReport());
                }
           // }
        }finally{
            if(service != null) service.shutdown();
        }
    }
    
}
