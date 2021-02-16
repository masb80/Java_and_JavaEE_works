package OCAExam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import static java.util.Collections.*;
//static import java.util.Collections.sort(ArrayList<String);
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import OCAExam.rope.Rope;

public class RandomPracticeForOCA {

    static {
        System.out.println(
                "Java static block will called once when class is loaded. eventhough class is called several times, static block willl called once");
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n > 21) {
            return 2 * (Math.abs(21 - n));
        } else {
            return Math.abs(n - 21);
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && ((0 <= hour && hour < 7) || (20 < hour && hour <= 23))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        if ((a == 10 || b == 10 || a + b == 10)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean nearHundred(int n) {
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if ((((a < 0 && b >= 0) || (a >= 0 && b < 0)) && negative == false) || (negative == true && (a < 0 && b < 0))) {
            return true;
        } else {
            return false;

        }
    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }

    /* for array personal test */
    public void arraytest() {
        int ages[] = new int[5];
        int[][] array2dim = { { 1 }, { 2, 5 }, { 5, 7, 8 } };
        int[][][] array3dim = { { { 1 } }, { { 2 }, { 5 } }, { { 5, 7, 8 } } };
        for (int i = 0; i < 5; i++) {
            ages[i] = i;
        }
        // for(int e:ages)
        // System.out.println("first element is "+ e);
        // System.out.println(Arrays.deepToString(array2dim));
        // System.out.println(Arrays.deepToString(array3dim));

        // type casting
        // bytes, short, int, long, short, float, double, char
        int x = (int) 0.5;
        System.out.println(x);
        // object casting
        // super class is a relation in java
        // upcasting : ex: Animal jen = new Lion();

    }

    // read and write a java file in java
    public void readwrite() throws IOException {
        // need to use try/catch
        File file = new File("/home/samad/test.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        String fileContent = "Johana ekta churuni dushtami kore, sugar khay" + "\n";
        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }
        FileWriter write = new FileWriter("/home/samad/text1.txt");
        write.write(fileContent);
        write.close();
    }

    // constructor initialization test
    /*
     * private String name = "Fluffy"; boolean b1, b2; double d1; double d2; int i3,
     * i4;
     * 
     * PracticeCodebatting() { name = "Tiny";
     * System.out.println("setting constructor"); }
     * 
     * // constructor chaining page 201 in oca book private int n1; private int n2;
     * private int n3;
     * 
     * public PracticeCodebatting(int n3) { this(n3, 16); // new
     * PracticeCodebatting(n3, 16);
     * 
     * }
     * 
     * public PracticeCodebatting(int n3, int n1) { this(n3, n1, 6); }
     * 
     * public PracticeCodebatting(int n3, int n1, int n2) { this.n1 = n1; this.n2 =
     * n2; this.n3 = n3; }
     */

    // OCA cpnstructors
    // public static long PracticeCodebatting(int x){
    // long y = x* (long) x;
    // x = -1;
    // return y;

    // }

    // public void print() {
    // System.out.println("constructor chaining " + n1 + " " + n2 + " " + n3);
    // }
    // end constructor chaining page 201 in oca book

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch = 0;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }

    // for java operator preceeding practice
    public void operatorpreceeding() {
        int x = 5;
        int y = 6;
        System.out.println("operatorpreceeding  " + ((double) x++ / (3 - 1 * 2) > ((5 - 2) * 3)));
    }

    // for java if / while and ternary operator
    public void operatorternary() {
        int x = 5;
        int y = 6;
        boolean sunday;
        System.out.println("operatorternary  " + (sunday = x < 6 ? false : true));
    }

    // for infinite loop test
    public void infinitelooptest() {
        // int x =1, y=15;
        // while (x < 10){
        // y--;
        // x++;
        // system.out.println(x+", "+y);
        // }
    }

    // hackerrank practice
    // int, double and string stdin and then print
    class Solution {
        public void intdoubleandstringstdinandthenprint() {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            // Write your code here.
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();
            scan.close();
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }

    public void printfpractice() {
        // double num = 123.45677;
        // DecimalFormat ft = new DecimalFormat("####");
        // System.out.println("not decimal "+ft.format(num));;
        // DecimalFormat ft1 = new DecimalFormat("#.###");
        // System.out.println("with all pecisions "+ft1.format(num));;
        // DecimalFormat ft2 = new DecimalFormat("#.000000");
        // System.out.println("with 6 palces after . "+ft2.format(num));;
        // DecimalFormat ft3 = new DecimalFormat("000000.000000");
        // System.out.println("with 6 left and the precisions "+ft3.format(num));;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("================================");
        // for(int i=0;i<3;i++)
        // {
        // String s1=sc.next();
        // int x=sc.nextInt();
        // //Complete this line
        // DecimalFormat ft3 = new DecimalFormat("000");

        // String fmt = "%1$4s %2$10s%n";
        // Console cnsl = System.console();
        // cnsl.printf(fmt, s1,ft3.format(x) );
        // }
        // System.out.println("================================");
        // Create the console object
        // Console cnsl
        // = System.console();

        // if (cnsl == null) {
        // System.out.println(
        // "No console available");
        // return;
        // }

        // String fmt = "%1$1s %2$15s%n";
        // DecimalFormat ft3 = new DecimalFormat("000");
        // int x = 17;
        // cnsl.printf(fmt, "Books", ft3.format(x));
        // System.out.printf("%-15s%03d\n","15",5);
        // cnsl.printf(fmt, "Books", "Author", "Price");
        // cnsl.printf(fmt, "-----", "------", "-----");
        // cnsl.printf(fmt, "DBMS", "Navathe", "800");
        // cnsl.printf(fmt, "Algorithm", "Cormen", "925");
        // cnsl.printf(fmt, "Operating System", "Rajib Mall", "750");

        // finally solved
        // Scanner sc=new Scanner(System.in);
        // System.out.println("================================");
        // for(int i=0;i<3;i++)
        // {
        // String s1=sc.next();
        // int x=sc.nextInt();
        // //Complete this line
        // System.out.printf("%-15s%03d\n",s1,x);
        // }
        // System.out.println("================================");

    }

    public void ifconditionPractice() {
        // final Scanner scanner = new Scanner(System.in);
        // int N = scanner.nextInt();
        int N = 6;
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (1 <= N && N <= 100) {
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && (2 <= N && N <= 5)) {
                System.out.println("Not Weird");
            } else if (N % 2 == 0 && (6 <= N && N <= 20)) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N > 20) {
                System.out.println("Not Weird");
            }
        }

        // scanner.close();
    }

    // Day 4, Class vs. instance
    class Person {
        private int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            } else {
                this.age = initialAge;
            }

        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct
            // statement:
            if (age >= 0 && age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");

            }

        }

        public void yearPasses() {
            age = age + 1;
        }
    }

    // for java loops
    class Solution1 {
        // private static final Scanner scanner = new Scanner(System.in);

        // N = 2;
        // //N.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // if(2 <= N && N <= 20 ){
        // int i;
        // int N = 2;
        // for(i=1; i < 11; i++){
        // System.out.println(N +" x "+ i +" = "+ N * i);
        // }
        // }

        // scanner.close();

    }
    // Day 6 of 30 days java (3 test case failed)
    /*
     * class Solution6 {
     * 
     * /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    /*
     * Scanner scanner = new Scanner(System.in); int n = scanner.nextInt();
     * 
     * 
     * int i; if(1 <= n && n<= 10){ for (i=0; i< n; i++){ String str =
     * scanner.next(); if(2 <= str.length() && str.length() <= 1000){ StringBuilder
     * stev = new StringBuilder(""); StringBuilder stodd = new StringBuilder(""); //
     * String stev =""; // String stodd =""; int j; for(j=0; j<str.length(); j++){
     * if(j % 2 ==0){ //stev+=str[j]; // str.charAt(0); stev.append(str.charAt(j));
     * }else if(j % 2 !=0){ stodd.append(str.charAt(j)); } }
     * System.out.println(stev+" "+stodd); } }
     * 
     * }
     * 
     * 
     * 
     * }
     */

    /*
     * Can You Solve Java Datatypes? A byte is an 8-bit signed integer. A short is a
     * 16-bit signed integer. An int is a 32-bit signed integer. A long is a 64-bit
     * signed integer.
     */
    /*
     * class Solution7{
     * 
     * Scanner sc = new Scanner(System.in); int t=sc.nextInt();
     * 
     * for(int i=0;i<t;i++) {
     * 
     * try { long x=sc.nextLong(); System.out.println(x+" can be fitted in:");
     * if(x>=-128 && x<=127)System.out.println("* byte"); //Complete the code
     * if(x>=-32768 && x<=32767)System.out.println("* short"); if(x>=-Math.pow(2,
     * 31) && x<= Math.pow(2, 31) - 1)System.out.println("* int");
     * if(x>=-Math.pow(2, 63) && x<= Math.pow(2, 63) -
     * 1)System.out.println("* long"); } catch(Exception e) {
     * System.out.println(sc.next()+" can't be fitted anywhere."); }
     * 
     * }
     * 
     * 
     * }
     */
    /*
     * Task: Given names and phone numbers, assemble a phone book that maps friends'
     * names to their respective phone numbers. You will then be given an unknown
     * number of names to query your phone book for. For each queried, print the
     * associated entry from your phone book on a new line in the form
     * name=phoneNumber; if an entry for is not found, print Not found instead.
     * 
     * 
     * class Solution{ public static void main(String []argh){ Scanner in = new
     * Scanner(System.in); int n = in.nextInt(); Map<String, Integer> map = new
     * HashMap<String,Integer>(); if(1 <= n && n <= Math.pow(10,5)){ for(int i = 0;
     * i < n; i++){ String name = in.next(); int phone = in.nextInt(); // Write code
     * here map.put(name, phone); } while(in.hasNext()){ String s = in.next(); //
     * Write code here System.out.println(( map.get(s) != null) ? s + "=" +
     * map.get(s) : "Not found"); } } in.close(); } }
     * 
     */

    public static void binaryconverttest() {
        int x = 15;
        String str = Integer.toBinaryString(x);
        int cnt = maxConsecutiveOnes(x);
        System.out.println(cnt);

    }

    private static int maxConsecutiveOnes(int x) {
        // Initialize result
        int count = 0;

        // Count the number of iterations to
        // reach x = 0.
        while (x != 0) {
            // This operation reduces length
            // of every sequence of 1s by one.
            x = (x & (x << 1));
            count++;
        }

        return count;
    }

    /*
     * The challenge here is to read lines of input until you reach EOF, then number
     * and print all lines of content.
     * 
     * Hint: Java's Scanner.hasNext() method is helpful for this problem. public
     * class Solutio7 { // Enter your code here. Read input from STDIN. Print output
     * to STDOUT. Your class should be named Solution. Scanner scan = new
     * Scanner(System.in); for(int i = 1; scan.hasNext()== true; i++){
     * System.out.println(i + " " + scan.nextLine()); }
     * 
     * 
     * }
     */

    /*
     * hacke rank Task You are given two classes, Person and Student, where Person
     * is the base class and Student is the derived class. Completed code for Person
     * and a declaration for Student are provided for you in the editor. Observe
     * that Student inherits all the properties of Person. Complete the Student
     * class by writing the following: A Student class constructor, which has
     * parameters: A string, . A string, . An integer, . An integer array (or
     * vector) of test scores, . A char calculate() method that calculates a Student
     * object's average and returns the grade character
     * 
     */
    // The following method demonstrates the access to super constructors in Java.

    class Parent {
        String myStr;

        public Parent(String name) // base class constructor
        {
            myStr = name;
        }
    }

    class Child extends Parent {
        String myStr;

        public Child(String name1, String name2) {

            super(name1); // call base class constructor and pass argument value
            this.myStr = name2;
        }

        public void printDetails() // print details of both constructors
        {
            System.out.println("From base class constructor: " + super.myStr);
            System.out.println("From derived class constructor: " + myStr);
        }
    }

    class Person1 {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person1(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
        }

    }

    class Student extends Person1 {
        int[] testScores;

        // Write your constructor here
        Student(String firstName, String lastName, int idNumber, int[] scores) {
            super(firstName, lastName, idNumber);
            this.testScores = scores;
        }

        // Write your method here
        public String calculate() {
            double total = 0;
            for (int i = 0; i < testScores.length; i++) {
                total = total + testScores[i];
            }
            double average = 0.0;
            if (testScores.length > 0) {
                average = total / testScores.length;
            }
            String a = "";
            if (90 <= average && average <= 100) {
                a = "O";
            } else if (80 <= average && average < 90) {
                a = "E";
            } else if (70 <= average && average < 80) {
                a = "A";
            } else if (55 <= average && average < 70) {
                a = "P";
            } else if (40 <= average && average < 55) {
                a = "D";
            } else if (average < 40) {
                a = "T";
            }

            return a;
        }

    }

    // class Solution10 {//
    // public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);
    // String firstName = scan.next();
    // String lastName = scan.next();
    // int id = scan.nextInt();
    // int numScores = scan.nextInt();
    // int[] testScores = new int[numScores];
    // for(int i = 0; i < numScores; i++){
    // testScores[i] = scan.nextInt();
    // }
    // scan.close();

    // Student s = new Student(firstName, lastName, id, testScores);
    // s.printPerson();
    // System.out.println("Grade: " + s.calculate() );
    // }
    // }

    /*
     * Task Given a Book class and a Solution class, write a MyBook class that does
     * the following:
     * 
     * Inherits from Book Has a parameterized constructor taking these parameters:
     * string string int Implements the Book class' abstract display() method so it
     * prints these lines: , a space, and then the current instance's . , a space,
     * and then the current instance's . , a space, and then the current instance's
     * .
     * 
     */
    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    // Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable

    /**
     * Class Constructor
     * 
     * @param title  The book's title.
     * @param author The book's author.
     * @param price  The book's price.
     **/
    class MyBook extends Book {
        int price;

        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }
    }
    // Write your constructor here

    /**
     * Method Name: display
     * 
     * Print the title, author, and price in the specified format.
     **/
    // Write your method here

    // End class

    // public class Solution {

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // String title = scanner.nextLine();
    // String author = scanner.nextLine();
    // int price = scanner.nextInt();
    // scanner.close();

    // Book book = new MyBook(title, author, price);
    // book.display();
    // }
    // }
    // class Difference {
    // private int[] elements;
    // public int maximumDifference;

    // // Add your code here
    // Difference(int[] elm){
    // this.elements = elm;
    // }

    public void computeDifference() {
        int[] elements = { 333, 5, 7 };
        Arrays.sort(elements);
        int min = elements[0];
        int diff = 0;

        for (int i = 1; i < elements.length; ++i) {
            // if (elements[i] > min){
            diff = Math.max(elements[i] - min, diff);
            // }
            // min = Math.min(min, elements[i]);
        }
        // maximumDifference = diff;
    }
    // End of Difference class

    // linked list
    /*
     * class Node { int data; Node next; Node(int d) { data = d; next = null; } }
     * 
     * 
     * public static Node insert(Node head,int data) { // Complete this method
     * if(head == null){ // fast element head = new Node(data); }else if(head.next
     * == null){ // last element head.next = new Node(data); }else{
     * insert(head.next, data); } return head;
     * 
     * }
     * 
     * public static void display(Node head) { Node start = head; while(start !=
     * null) { System.out.print(start.data + " "); start = start.next; } }
     * 
     * 
     * 
     */

    /*
     * 
     * //Read a string, , and print its integer value; if cannot be converted to an
     * integer, print Bad String. //Note: You must use the String-to-Integer and
     * exception handling constructs built into your submission language. //If you
     * attempt to use loops/conditional statements, you will get a score.
     * 
     * 
     * class Solution11 {
     * 
     * 
     * Scanner in = new Scanner(System.in); String S = in.next(); try { int i=
     * Integer.parseInt(S); System.out.println(i); } catch(NumberFormatException ex)
     * { System.out.println("Bad String"); }
     * 
     * }
     */
    public static void hourglass() {
        // Integer[][] arr = new Integer[6][6];
        int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
                { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
        int maxval = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {

                maxval = Math.max(arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2], maxval);

            }
        }
        System.out.println("hourglass result   :" + maxval);

    }

    /*
     * The elements of a String are called characters. The number of characters in a
     * String is called the length, and it can be retrieved with the String.length()
     * method. Given two strings of lowercase English letters, and , perform the
     * following operations: Sum the lengths of and . Determine if is
     * lexicographically larger than (i.e.: does come before in the dictionary?).
     * Capitalize the first letter in and and print them on a single line, separated
     * by a space.
     * 
     * public class Solution {
     * 
     * public static void main(String[] args) {
     * 
     * Scanner sc=new Scanner(System.in); String A=sc.next(); String B=sc.next();
     * 
     * String c = A + B; System.out.println(c.length()); if(A.compareTo(B) > 0){
     * System.out.println("Yes"); }else{ System.out.println("No"); }
     * System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,
     * A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1, B.length()));
     * 
     * } }
     * 
     * 
     */
    /*
     * Task Write a Calculator class with a single method: int power(int,int). The
     * power method takes two integers, and , as parameters and returns the integer
     * result of . If either or is negative, then the method must throw an exception
     * with the message: n and p should be non-negative.
     */
    // Write your code here
    class Calculator {
        public int power(int n, int p) {
            int result = 1;
            if (n < 0 || p < 0) {
                throw new IllegalArgumentException("n and p should be non-negative");
            } else {
                while (p != 0) {
                    result *= n;
                    --p;
                }
                return result;
            }
        }
    }

    /* stack and queue practice */
    static class Solution12 {
        // Write your code here.
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<>();

        void pushCharacter(char ch) {
            stack.push((Character) ch);
        }

        void enqueueCharacter(char ch) {
            queue.add((Character) ch);
        }

        char popCharacter() {
            return stack.pop();
        }

        char dequeueCharacter() {
            return queue.remove();
        }
    }

    /* interface practice */
    interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    static class Calculator1 implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    /* Bubble sort */
    static class Solution13 {
        static void bubblesort() {
            int n = 3;
            int[] a = { 1, 3, 2 };

            // Write Your Code Here
            int numofswaps = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        numofswaps++;
                    }
                }
                if (numofswaps == 0) {
                    break;
                }
            }
            System.out.println("Array is sorted in " + numofswaps + " swaps.");
            System.out.println("First Element: " + a[0]);
            System.out.println("Last Element: " + a[a.length - 1]);
        }
    }

    // generic problem
    static class Printer<T> {

        /**
         * Method Name: printArray Print each element of the generic array on a new
         * line. Do not return anything.
         * 
         * @param A generic array
         **/

        // Write your code here
        public static <E> void printArray(E[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    // OCP exam
    public void OCPquestions() {
        // listPractoceno25 chapter 3
        // List<String>hex = Arrays.asList("30", "8","3A", "FF","uu");
        // Collections.sort(hex);
        // for(String x : hex){
        // System.out.println(x);
        // }
        // int x = Collections.binarySearch(hex, "8");
        // int y = Collections.binarySearch(hex, "3A");
        // int z = Collections.binarySearch(hex, "4F");
        // System.out.println(x + " " + y + " " + z);

        // listPractoceno26 chapter 3

        // List<Integer> ages = new ArrayList<>();
        // ages.add(Integer.parseInt("5"));
        // ages.add(Integer.valueOf("6"));
        // ages.add(7);
        // ages.add(null);
        // for(int age: ages){
        // System.out.println(age);
        // }

        // listPractoceno27 chapter 3
        // List<String>one = new ArrayList<String>();
        // one.add("abc");
        // List<String>two = new ArrayList<String>();
        // two.add("abc");
        // if(one == two){
        // System.out.println("A");
        // }else if(one.equals(two)){
        // System.out.println("B");
        // }else{
        // System.out.println("C");
        // }

        // listPractoceno28 chapter 3

        // LocalDate date = LocalDate.now();
        // LocalDate date1 = new LocalDate(2014, 6, 21);
        // LocalDate date = new LocalDate(2014, 5, 21);
        // LocalDate date1 = new LocalDate(2014, 6, 21);
        // LocalDate date2 = LocalDate.of(2014, 5, 21);
        // LocalDate date3 = LocalDate.of(2014, 6, 21);
        // LocalDate date4 = LocalDate.of(2014, Calendar.JUNE, 21);
        // LocalDate date5 = LocalDate.of(2014, Month.JUNE, 21);
        // LocalDateTime datetime = date2.atTime(1,50,9);
        // System.out.println(date);

        // listPractoceno30 chapter 3

        // LocalDate date1 = LocalDate.of(2018, Month.APRIL, 40);
        // System.out.println(date1.getYear()+" " + date1.getMonth() +" "+
        // date1.getDayOfMonth());
        // listPractoceno31 chapter 3
        // LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        // date.plusDays(2);
        // date.plusYears(3);
        // System.out.println(date.getYear()+" " + date.getMonth() +" "+
        // date.getDayOfMonth());

        // listPractoceno32 and 33 chapter 3
        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11,22,33);
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int
        // hour, int minute, int second, int nanoOfSecond)

        // Period p = Period.of(1,2,3); // (no of year, month, days)
        // Period p = Period.ofDays(1).ofYears(2);
        // d=d.minus(p); // subtraction
        // DateTimeFormatter f =
        // DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // System.out.println(d.format(f));
        /*
         * ===============================OCP Chapter 1
         * ===================================
         */

    }

    // oca page 222
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    // {
    // System.out.printlln(rope1.length);
    // }
    // OCA PAGE 222 NO 14
    public void mathod(ArrayList<String> list) {
        // sort(list);
    }

    // no 15
    public void print1(byte x) {
        System.out.println("byte");
    }

    public void print1(int x) {
        System.out.println("int");
    }

    public void print1(float x) {
        System.out.println("float");
    }

    public void print1(Object x) {
        System.out.println("Object");
    }

    // page 227 no 23:

    // String value="t";
    // {value += "a";};
    // {value += "c";};
    // public PracticeCodebatting(){
    // value += "b";
    // }
    // public PracticeCodebatting(String s){
    // value += s;
    // }
    // page 227 no 24
    // final String v1 = "1";
    // static String v2 = "2";
    // String v3 = "3";

    // {v2 = "d";}
    // static{
    // v2 ="d";
    // };

    // private static void check(Climb climb, int ht){
    // if(climb.isTooHight(ht, 10))
    // System.out.println("too high");
    // else
    // System.out.println("ok");
    // }

    interface Tes {
        // public static final is imlicit
        int x = 3;

        public void abc(); // if not abstract then by default its creted
    }

    abstract class Test13 {
        abstract void abc(); // abstract must

    }

    /* exception handling page 327 */

    public static int exceptionhandling() throws ArithmeticException {
        var a = 0;
        var b = 0;
        try {
            return a / b;

        } catch (RuntimeException e) {
            return -1;
        } finally {
            System.out.println("OCP page 327 done");
        }
    }

    public static void exceptionhandling9() {
        try {
            System.out.println("startig up");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("problem");
            System.exit(0);
        } finally {
            System.out.println("shutting down");
        }
    }

    public static class Dog {
        public String name; // var is not allowed in here BUT WHY
        // var name = 8.9; // var is not allowed in here

        public void parseName() {
            System.out.print("1");
            try {
                System.out.print("2");
                int x = Integer.parseInt(name);
                System.out.print("3");

            } catch (NumberFormatException e) {
                // }catch(NullPointerException e){ // no 11
                System.out.print("4");
            }

            // NO 19
            try {
                System.out.println("yes");
                // }catch(IllegalArgumentException e){
            } catch (StackOverflowError e) {

            } catch (RuntimeException e) {

            }

        }

    }

    public static class No20 {

    }

    // OCP examinations

    // Variable Declaration and Initialization

    public static void main(String args[]) {
        // public static void main(String args[]) throws IOException {
        boolean aSmile = true;
        boolean bSmile = true;
        RandomPracticeForOCA obj = new RandomPracticeForOCA();
        boolean weareintrouble = obj.monkeyTrouble(aSmile, bSmile);
        System.out.println(weareintrouble);
        System.out.println(obj.sumDouble(3, 3));
        System.out.println(obj.diff21(19));
        System.out.println(obj.parrotTrouble(true, 6));
        System.out.println(obj.makes10(9, 10));
        System.out.println(obj.nearHundred(93));
        System.out.println(obj.posNeg(-4, 5, true));

        int[] t = { 1, 2, 6 };
        System.out.println(obj.firstLast6(t));
        // obj.arraytest();
        // object casting practice
        RandomPracticeForOCA obj1 = new Lion();
        System.out.println(obj1.posNeg(-4, 5, true));
        ((Lion) obj1).roar(); // subclass casting is downcasting
        Lion li = (Lion) obj1; // subclass casting is dowwncasting
        Mamal ma = new Mamal();
        // ((Lion) ma).roar(); // oracle java casting example
        // difference between primitive types and reference types
        int i1 = 5; // i1 will make a address and placed a value 5
        int i2 = i1; // i2 will make new adderss and will place 5, which is not same address as i1
        String s1 = "string"; // here s1 is a reference types and make 2 address one for s1 and one for string
        String s2 = s1;
        // when primitive type they are different box means different address of each
        // when reference types then different variables but same address
        // read and write to file in java
        try {
            obj.readwrite();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // for order of initialization and initialize private variables in constructor
        // System.out.println(obj.name);
        obj.operatorpreceeding();
        obj.operatorternary();
        // obj.OCPquestions();
        // System.out.println(obj);
        // private String brand;
        // private boolean empty;
        // System.out.println(obj.empty); // error: empty and brand has private access
        // in Waterbottle
        // System.out.println(obj.brand);
        obj.printfpractice();
        obj.ifconditionPractice();
        // PracticeCodebatting obj4 = new PracticeCodebatting(9);
        // obj4.print(); // problem ache, hoy nai
        binaryconverttest(); // made static variable and then can directly called in the same class

        // Child cobj = new Child("Super constructor string","Child constructor
        // string");
        // cobj.printDetails();
        obj.computeDifference();
        // for linked list

        // Node head = null;

        // PracticeCodebatting(Node head,int data);

        // hour glass in hacker rank
        hourglass();

        // page 221 chapter 4 test
        // Rope.swing();
        // new Rope().swing();
        // System.out.println(Rope.LENGTH); // Does not compile
        // Rope rope = new Rope();
        // rope.play();
        // Rope rope2 = null;
        // rope2.play();
        rope1.length = 2;
        rope2.length = 8;
        // Rope.length = 2;
        // rope2.length = 8;
        System.out.println(rope1.length);

        // no 15
        short s = 123;
        obj.print1(s);
        obj.print1(true);
        obj.print1(6.789);

        // no 16 page 222
        // int value =9;
        // long result = PracticeCodebatting(value);
        // System.out.println(value);

        // no 23 page 228
        // PracticeCodebatting order = new PracticeCodebatting("f");
        // order = new PracticeCodebatting();
        // System.out.println(order.value);
        // check((h,l) -> h.append(l).isEmpty(), 5);
        /*
         * Exception handling in java you tube try, catch, finally, throw, throws
         */
        String[] pets = { "dog", "cat", "monkey" };
        System.out.println(pets[0]);
        ArrayList<String> list = new ArrayList<String>();
        try {
            System.out.println(list.get(0));
        } catch (Exception e) {
            System.out.println(e);
        }

        /* stack and queue */
        String input = "racecar";

        // Convert input String to an array of characters:
        char[] s12 = input.toCharArray();

        // Create a Solution object:
        Solution12 p = new Solution12();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s12) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s12.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));

        /* implements interface */
        int n = 6;
        AdvancedArithmetic myCalculator = new Calculator1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);

        /* bubble sort */
        Solution13.bubblesort();

        // exception handling
        // exceptionhandling();
        // exceptionhandling9();
        exceptionhandling();
        Dog leroy = new Dog();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.println("5");

        // NO 20 oca exception
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            // throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.println("d");
            throw new RuntimeException("2");
        } finally {
            System.out.println("e");
            // throw new RuntimeException("3");
        }

        // NO 19
        // try{
        // System.out.println("yes");
        // // }catch(IllegalArgumentException e){
        // }catch(StackOverflowError e){

        // }catch(RuntimeException e){

        // }

        // virtual method in java

        // generic problem

        int n2 = 4;
        Integer[] intArray = new Integer[n2];
        for (int i = 0; i < n2; i++) {
            intArray[i] = i;
        }

        String[] stringArray = new String[n2];
        String ss[] = { "aa", "bb", "helo", "worl" };
        for (int i = 0; i < n2; i++) {
            stringArray[i] = ss[i];
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }

    }
}

class Lion extends Mamal {
    public void roar() {
        System.out.println("print form Lion subclass");
    }
}

class Mamal extends RandomPracticeForOCA {
    public void mamalmethods() {
        System.out.print("print form mamal subclass");
    }
}

// page 230 no 27 hoy nai
interface Climb {
    boolean isTooHight(int ht, int lt);
}

class WaterBottle {
    private String brand;
    private boolean empty;

    public String getWatebottle() {
        return this.brand;
    }

    public Boolean getempty() {
        return this.empty;
    }

    public void setWatebottle(String brand) {
        this.brand = brand;
    }

    public void setempty(Boolean empty) {
        this.empty = empty;
    }

}