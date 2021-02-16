package OCPExam.chapter3.comparableandcomparator;

import java.util.Comparator;

public class Laptop {
    // implementation of comparable
//public class Laptop implements Comparable<Laptop>{ 
//public class Laptop implements Comparator<Laptop>{ 

    private String brand;
    private int rom;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Laptop(String brand, int rom, int price) {
        this.brand = brand;
        this.rom = rom;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + ", rom=" + rom + "]";
    }

    // implementation of comparable
    
    // @Override
    // public int compareTo(Laptop lap2) {
    //     // this > lap2 = +
    //     // this < lap2 = -
    //     // this = lap2 = 0
    //     if(this.getRom() > lap2.getPrice())
    //         return 1;
    //     else
    //         return -1; 
    // }
    // public int compare(Laptop l1, Laptop l2){
    //     int result = l1.getBrand().compareTo(l2.getBrand());
    //     if(result !=0) return result;
    //     return l1.getRom() -l2.getRom();  
    // }

    // using method referencing
    public static int compareByPrice(Laptop l1, Laptop l2){
        return l1.getPrice() - l2.getPrice();
    }
}
