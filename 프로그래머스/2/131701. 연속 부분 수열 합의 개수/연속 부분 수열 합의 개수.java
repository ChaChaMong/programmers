import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int k = 0; k < elements.length; k++) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j < i + k + 1; j++) {
                    sum += elements[j % elements.length];
                }
                set.add(sum);
                sum = 0;
            }
        }
        answer = set.size();
        
        return answer;
    }
}