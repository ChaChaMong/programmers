import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
        
        for (int num : nums) {
            hash.add(num);
            if (hash.size() >= nums.length / 2) {
                break;
            }
        }
        
        answer = hash.size();
        
        return answer;
    }
}