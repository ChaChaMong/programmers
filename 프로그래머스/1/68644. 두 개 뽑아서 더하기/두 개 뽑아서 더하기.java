import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> answerSet = new HashSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1 ; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }
        
        Integer[] temp = answerSet.toArray(new Integer[0]);        
        answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i];
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}