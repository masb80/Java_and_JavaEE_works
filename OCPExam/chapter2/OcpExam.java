package OCPExam.chapter2;

import java.util.HashMap;
import java.util.Map;

public class OcpExam {
    // equals and hashcode
    public static void main(String arg[]) {
        Student s = new Student("H123");
        Student s1 = new Student("H123");
        String s5 = "csns";
        String s2 = new String(s5);
        if( s5 == s2) System.out.println("s5 == s2    ");
        else System.out.println("s5 not equal s2"); 
        System.out.println(s == s1); // they are in different address
        System.out.println(s.equals(s1));
        Map<Student, String> map = new HashMap<Student, String>();
        map.put(s, "123");
        map.put(s1, "123");
        System.out.println(map.size());

        // hascode already in wrraper class
        Integer i = new Integer(1);
        Integer i1 = new Integer(1);
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(i, "123");
        map1.put(i1, "123");
        System.out.println(map1.size());
    }

}

class Student {
    private String regino = "";

    public Student(String regino) {
        this.regino = regino;
    }
}