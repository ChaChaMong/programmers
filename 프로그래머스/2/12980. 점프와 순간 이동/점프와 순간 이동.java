import java.util.*;

public class Solution {
    public int solution(long n) {
        int ans = 0;

        for (long i = 1; i <= n;) {
            if (n % 2 == 1) {
                ans += 1;
                n -= 1;
            }
            
            n /= 2;
        }
        
        return ans;
    }
}