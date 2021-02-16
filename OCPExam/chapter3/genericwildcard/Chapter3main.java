package OCPExam.chapter3.genericwildcard;

import java.util.stream.Stream;


public class Chapter3main {
    
    public static void main(String[] args) {
       var students = new String[]{"CANADA", "USA"} ;
       var scr = new Integer[]{22,434,55,77};

       var st1 = new WildclassExample<>(students);
       var scr1 = new WildclassExample<>(scr);

       System.out.println(scr1.list.length);
       System.out.println(st1.list.length);
       scr1.greaterthan(st1);
       st1.greaterthan(st1);
     Stream.of(scr).sorted().forEach(a->System.out.println(a));
    }
    
}
