package hacker_rank_30_days.Day_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day29Regex {
  private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> list = new ArrayList();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.contains("@gmail.com")){
              list.add(firstName);
            }           
        }
        list.stream().sorted().forEach(k -> System.out.println(k));
        scanner.close();
    }

}
