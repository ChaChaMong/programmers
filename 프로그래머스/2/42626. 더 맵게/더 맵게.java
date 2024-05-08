import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        
        for (int num : scoville) {
            queue.offer(num);
        }
   
        while(queue.size() > 1) {            
            if (queue.peek() >= K) {
                break;
            }
            
            queue.offer(queue.poll() + queue.poll() * 2);
            answer++;
        }
        
        if (queue.size() == 1 && queue.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}