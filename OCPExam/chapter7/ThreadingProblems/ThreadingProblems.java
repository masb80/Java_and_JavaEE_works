package OCPExam.chapter7.ThreadingProblems;
/*
Deadlock:

    imagine that our zoo has two foxes; Foxy and Tails. Foxy likes to eat first and then drink water, while Tails 
    likes to drink water first and then eat. Futhermore, neither animal likes to share, and they will finish their meal
    only if they have exclusive access to both food and water.

    The zookeeper places the food on one side of the environment and the water on the other side. although
    our foxes are fast, it still takes then 100 milliseconds to run from one side of the environment to the other.
    
    what happens if Foxy gets the food first ad Tails gets the water first? 

*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadingProblems {
    public void eatAndDrink(Food food, Water water){
        synchronized(food){
            System.out.println("Got Food");
            move();
            synchronized(water){
                System.out.println("Got water");
            }
        }
    }
    public void drinkAndEat(Food food, Water water){
        synchronized(water){
            System.out.println("Got water");
            move();
            synchronized(food){
                System.out.println("Got food");
            }
        }
    }


    private void move() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        /*
        In this example, Foxy obtains the food and then moves to the other side of 
        the environment to obtain the water. Unfortunately, Tails already drank 
        the water and is waiting for the food to become available. 
        The result is that our program will be hang out infinitely
        */
        
        ThreadingProblems foxy = new ThreadingProblems();
        ThreadingProblems traits = new ThreadingProblems();
        Food food = new Food();
        Water water = new Water();

        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(()-> foxy.eatAndDrink(food, water));
            service.submit(()-> traits.drinkAndEat(food, water));
        } finally  {
           if(service !=null){
               service.shutdown();
           }
        }


    }
    
}
