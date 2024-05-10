import java.util.*;

class Solution {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        int[] sortFood = food_times.clone();
        
        Arrays.sort(sortFood);
        
        int roof = 0;
        int roofCount = 0;
        long count = 0;
        for (int i = 0; i < sortFood.length; i++) {
            for (int j = 0; j < sortFood[i] - roof; j++) {
                count += (sortFood.length - i);
                roofCount++;

                if (count > k) {
                    break;
                }
            }
            
            if (count > k) {
                count -= (sortFood.length - i);
                break;
            }
            
            roof += (sortFood[i] - roof);
        }
        
        for (int i = 0; i < food_times.length; i++) {
            if (food_times[i] - roof > 0) {
                count++;
            }
            if (count > k) {
                answer = i + 1;
                break;
            }
        }
        
        if (answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}