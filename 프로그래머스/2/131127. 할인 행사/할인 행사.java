import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> discountMap = new HashMap<>();
        
        for (int i = 0; i < 9; i++) {
            if (discountMap.containsKey(discount[i])) {
                discountMap.put(discount[i], discountMap.get(discount[i]) + 1);
            } else {
                discountMap.put(discount[i], 1);
            }
        }
        
        for (int i = 9; i < discount.length; i++) {
            if (i > 9) {
                discountMap.put(discount[i - 10], discountMap.get(discount[i - 10]) - 1);
            } 
            
            if (discountMap.containsKey(discount[i])) {
                discountMap.put(discount[i], discountMap.get(discount[i]) + 1);
            } else {
                discountMap.put(discount[i], 1);
            }
        
            int cnt = 0;
            for (int j = 0; j < want.length; j++) {
                if (!discountMap.containsKey(want[j])) {
                    break;
                } else if (discountMap.get(want[j]) < number[j]) {
                    break;
                } else {
                    cnt++;
                }
            }
            
            if (cnt == want.length) {
                answer ++;
            }
        }
        
        return answer;
    }
}