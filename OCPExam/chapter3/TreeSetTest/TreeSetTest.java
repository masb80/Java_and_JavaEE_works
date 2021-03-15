package chapter3.TreeSetTest;

import java.util.TreeSet;

public class TreeSetTest{
    public static void main(String[] args){
        TreeSet<String> tree = new TreeSet<String>();
       tree.add("one") ;
       tree.add("One");
       tree.add("ONE");
       System.out.println(tree.ceiling("On"));
    }
}