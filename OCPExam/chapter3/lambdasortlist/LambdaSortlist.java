package OCPExam.chapter3.lambdasortlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaSortlist {
  public static void main(String[] args) {

    List<Integer>list = new ArrayList();
    list.add(5);
    list.add(25);
    list.add(85);
    list.add(55);
    list.add(15);

    Collections.sort(list);
    Collections.reverse(list);
   //list.stream().sorted().forEach(s->System.out.println(s));
    list.forEach(s->System.out.println(s));

        
    }
    
}
