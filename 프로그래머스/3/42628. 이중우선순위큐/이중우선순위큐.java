import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String operation : operations) {
            String[] oper = operation.split(" ");
            
            if (oper[0].equals("I")) {
                queue.offer(Integer.parseInt(oper[1]));         
                maxQueue.offer(Integer.parseInt(oper[1]));          
            } else if (oper[0].equals("D") && !queue.isEmpty()) {
                if (Integer.parseInt(oper[1]) > 0) {
                    int del = maxQueue.poll();
                    queue.remove(del);
                } else {
                    int del = queue.poll();
                    maxQueue.remove(del);
                }
            }
        }
        
        if (queue.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = maxQueue.peek();
            answer[1] = queue.peek();
        }
        
        
        return answer;
    }
}