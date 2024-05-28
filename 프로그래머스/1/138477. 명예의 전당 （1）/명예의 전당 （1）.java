import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        Queue<Integer> recode = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            recode.offer(score[i]);
            if (recode.size() > k) {
                recode.poll();
            }
            answer[i] = recode.peek();
        }
        
        
        return answer;
    }
}