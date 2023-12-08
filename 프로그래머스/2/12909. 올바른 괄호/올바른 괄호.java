import java.util.List;
import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

        List<Character> list = new ArrayList<Character>();
                        
        for (int i = 0; i < s.length(); i++) {
            if (list.size() == 0) {
                list.add(s.charAt(i));
            }
            else if (list.get(list.size() - 1) == '(' && s.charAt(i) == ')') {
                   list.remove(list.size() - 1);
            } 
            else {
                list.add(s.charAt(i));
            }
        }
        
        if (list.size() == 0) {
            answer = true;
        }
        
        return answer;
    }
}