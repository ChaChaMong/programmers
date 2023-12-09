import java.util.List;
import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        
        if (s.charAt(0) == '(') {
            count++;
        } 
        else {
            count--;
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (count < 0) {
                answer = false;
                break;
            }
            else if (s.charAt(i) == '('){
                count++;
            }
            else if (s.charAt(i) == ')'){
                count--;
            }
        }
        if (count == 0) {
            answer = true;
        }
        
        return answer;
    }
}