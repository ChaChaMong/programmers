import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[str.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int)str.charAt(i) - 48;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}