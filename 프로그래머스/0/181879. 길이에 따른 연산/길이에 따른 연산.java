import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        if (num_list.length > 10) {
            answer = Arrays.stream(num_list).sum();
        } else {
            answer = 1;
            for (int item : num_list) {
                answer *= item;
            }
        }
        
        return answer;
    }
}