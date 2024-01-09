class Solution {
    static int[] memo;
    
    public int solution(int n) {        
        memo = new int[n + 1];
        
        return fibonacciMemo(n);
    }
    
    public static int fibonacciMemo(int n) {
        if (n <= 1) {
            return n;
        } else {
            if (memo[n] == 0) {
                memo[n] = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
            }
            return memo[n] % 1234567;
        }
    }
}