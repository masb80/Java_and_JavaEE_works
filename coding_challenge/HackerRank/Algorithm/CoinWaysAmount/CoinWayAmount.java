package CoinWaysAmount;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CoinWayAmount {
    public static long numWays(int n, List<Long> coins, int coinNumber, HashMap<String, Long> cache) {
        /* Check our cache */
        String key = n + "," + coinNumber;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        /* Base case */
        if (coinNumber == coins.size() - 1) {
            if (n % coins.get(coinNumber) == 0) {
                cache.put(key, 1L);
                return 1;
            } else {
                cache.put(key, 0L);
                return 0;
            }
        }
        /* Recursive case */
        long ways = 0;
        for (int i = 0; i <= n; i += coins.get(coinNumber)) {
            ways += numWays(n - i, coins, coinNumber + 1, cache);
        }
        /* Cache and return solution */
        cache.put(key, ways);
        return ways;
    }

    public static long getWays(int n, List<Long> coins) {
        // Write your code here
        if (n < 0) {
            return 0;
        }
        return numWays(n, coins, 0, new HashMap<String, Long>());

    }

    public static void main(String[] args) {

        // int [] coins = {1,2,5};
        // ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(1L,2L, 3L));
        ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(2L, 5L, 3L, 6L));

        // long l = getWays(4,list);
        long l = getWays(10, list);
        System.out.println(l);
    }

}
