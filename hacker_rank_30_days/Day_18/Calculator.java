package hacker_rank_30_days.Day_18;
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
