package hacker_rank_30_days.Day_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day9DictinariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (1 <= n && n <= Math.pow(10, 5)) {
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                map.put(name, phone);
            }
            while (in.hasNext()) {
                String s = in.next();
                // Write code here
                System.out.println((map.get(s) != null) ? s + "=" + map.get(s) : "Not found");
            }
        }
        in.close();
    }
}
