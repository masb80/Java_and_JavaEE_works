package OCPExam.chapter3.ComparatorTestPage165;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTestPage165 implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        return arg1.toLowerCase().compareTo(arg0.toLowerCase());
    }

    public static void main(String[] args){
        String[] values = {"123","Abb","aab"};
        Arrays.sort(values, new ComparatorTestPage165());
        for(String s: values)
        System.out.print(s+" ");
    }

    
}
