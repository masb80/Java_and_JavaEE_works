package PrintWriteSample;

import java.io.*;
public class PrintWriteSample {
    public static void main(String[] args) {
        File source = new File("zoo.log");
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(source)))) {
            out.print("Today's weather is :");
            out.println("Sunny");
            out.print("Todays temperature at the zoo is : ");
            out.print(1/3.0);
            out.println('C');
            out.format("It has rained 10.12 inches this year");
            out.println();
            out.printf("It may rain 21.2 more inches this year");            
        } catch (Exception e) {
            
        }
    }
}