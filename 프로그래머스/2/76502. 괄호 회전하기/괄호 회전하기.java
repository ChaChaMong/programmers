import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                if (stack.size() == 0) {
                    stack.push(queue.peek());
                } else if ((stack.peek() == '[' && queue.peek() == ']')
                          || (stack.peek() == '{' && queue.peek() == '}')
                          || (stack.peek() == '(' && queue.peek() == ')')) {
                    stack.pop();
                } else {
                    stack.push(queue.peek());
                }

                queue.offer(queue.peek());
                queue.poll();
            }

            if (stack.size() == 0) {
                answer++;
            }

            queue.offer(queue.peek());
            queue.poll();
        }
        
        
        return answer;
    }
}