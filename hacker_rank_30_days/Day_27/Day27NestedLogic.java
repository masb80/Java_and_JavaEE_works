package hacker_rank_30_days.Day_27;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day27NestedLogic {

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
     * class should be named Solution.
     */
    Scanner in = new Scanner(System.in);
    LocalDate date1;
    int t = 2;
    int lt = 0;
    int d, m, y;
    LocalDate date1reseave = LocalDate.now();
    while (t-- > 0) {
      d = in.nextInt();
      m = in.nextInt();
      y = in.nextInt();
      if (d >= 1 && d <= 31 && m >= 1 && m <= 12 && y >= 1 && y <= 3000) {
        date1 = LocalDate.of(y, m, d);
        if (lt == 1) {
          long fine = 0;
          if (date1.isBefore(date1reseave)) {
            if (date1.getYear() == date1reseave.getYear()) {
              if (date1.getMonth() == date1reseave.getMonth()) {
                fine = 15 * ChronoUnit.DAYS.between(date1, date1reseave);
                System.out.println(fine);
              } else {
                fine = 500 * ChronoUnit.MONTHS.between(date1, date1reseave);
                System.out.println(fine);
              }
            } else {
              fine = 10000;
              System.out.println(fine);
            }
          } else {
            System.out.println(fine);
          }
        }
        date1reseave = date1;
        lt++;
      }
    }
    in.close();
  }

}
