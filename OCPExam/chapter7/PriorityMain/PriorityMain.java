package OCPExam.chapter7.PriorityMain;

public class PriorityMain {
    static class HappyNewYear implements Runnable{

        @Override
        public void run() {
            System.out.println("Count down begins...");
            for(int i=10; i>0; i--){
                System.out.println(i);
            }
        }      
      
    }
    public static void main(String[] args) {
            Thread countDownThread = new Thread(new HappyNewYear());
           countDownThread.setPriority(Thread.MAX_PRIORITY); // 10
            countDownThread.start();
            System.out.println("Happy New Year!!!");
    }
}