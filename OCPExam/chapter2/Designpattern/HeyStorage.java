package OCPExam.chapter2.Designpattern;

public class HeyStorage {
    private int quantity = 0;
    private HeyStorage() {

    }
    private static final HeyStorage instance = new HeyStorage();

    public static HeyStorage getInstace(){
        return instance;
    }
    public synchronized void addHay(int amount){
        quantity += amount;
    }

    public synchronized boolean removeHay(int amount){
        if(quantity < amount) return false;
        quantity -= amount;
        return true;
    }
    public synchronized int getHayQuantity(){
        return quantity;
    }
    
}
