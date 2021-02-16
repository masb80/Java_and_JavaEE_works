package OCPExam.chapter3.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableandComparator{

 public static void main(String[] args) {
     
    List<Laptop>lap = new ArrayList<>();
    lap.add(new Laptop("Del", 16, 700));
    lap.add(new Laptop("Apple", 8, 1600));
    lap.add(new Laptop("Acer", 12, 500));

    /*
    Comparator<Laptop> com = new Comparator<Laptop>(){
        public int compare(Laptop l1, Laptop l2){
            if(l1.getRom() > l2.getRom()){
                return 1;
            }else{
                return -1;
            }
        }     
    }; // com variable has finished in here
    */

// using lambda exoressions
   //Comparator<Laptop> com = (l1, l2) -> l1.getRom() - l2.getRom(); 
   /* 
    Comparator<Laptop> com = new Comparator<Laptop>(){
        public int compare(Laptop l1, Laptop l2){
            int result = l1.getPrice().compareTo(l2.getPrice());
            if(l1.getRom() > l2.getRom()){
                return 1;
            }else{
                return -1;
            }
        }     
    }; // com variable has finished in here
    */

    // using method referencing
    Comparator<Laptop> com = Laptop::compareByPrice;

    Collections.sort(lap,com );
   //lap.forEach(x->System.out.println(x));
    lap.forEach(System.out::println);
 }
    
}
