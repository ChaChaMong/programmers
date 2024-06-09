import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            priority.offer(priorities[i]);
        }
        
        int point = 0;
        while (!priority.isEmpty()) {
            if (priority.peek() == queue.peek()) {
                answer++;
                if (location == 0) break;
                queue.poll();
                priority.poll();
            } else {
                queue.offer(queue.poll());
            }
            
            location--;
            if (location < 0) {
                location = priority.size() + location;
            }
        }
        
        return answer;
    }
}