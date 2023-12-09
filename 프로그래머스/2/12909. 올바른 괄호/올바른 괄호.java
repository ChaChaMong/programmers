import java.util.List;
import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '('){
                count++;
            }
            if (s.charAt(i) == ')'){
                count--;
            }
            if (count < 0) {
                answer = false;
                break;
            }
        }
        if (count == 0) {
            answer = true;
        }
        
        return answer;
    }
}