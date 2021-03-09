import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// java techie is good

public class FilterApply{
public static void main(String[] args){
    List<Integer>list = Arrays.asList(2,3,4,5,6,6);
    // there are a intermediate stage and final stage
    // like a stream has a inflow action and outflow action
    // list stream().filter(PREDICATE).forEach(t -> whatever needed);

    list.stream().sorted().distinct().filter(i-> i> 5).forEach(t -> System.out.print(t+" "));
    list.stream().sorted().distinct().filter(i-> i> 3).collect(Collectors.toList()).forEach(t -> System.out.print(t));
    List<Integer>list1 = list.stream().sorted().distinct().filter(i-> i> 3).collect(Collectors.toList());
    list1.stream().forEach(System.out::print);
}
}