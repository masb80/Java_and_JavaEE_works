package OCPExam.chapter7.ConcurrentCollections;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class ConcurrentCollections {
    private static Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
 
    // public synchronized void put(String key, Object value){
    //     foodData.put(key, value);
        
    // }
    // public synchronized Object get(String key){
    //     return foodData.get(key);
    // }

    public static void main(String[] args) {
       // ConcurrentCollections concol = new ConcurrentCollections();
       foodData.put("Penguin", 1);
       foodData.put("Dime", 5);
        System.out.println(foodData.get("Dime"));
        // Blocking Queue practice 
        try{
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>();
            blockingQueue.offer(39);
            //blockingQueue.offer(3933);
           // blockingQueue.offer(39666);
          blockingQueue.offer(31,4,TimeUnit.SECONDS);
           // System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MICROSECONDS));
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    
}
