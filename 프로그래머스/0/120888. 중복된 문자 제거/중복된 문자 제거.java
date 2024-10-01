import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();
        
        for (Character c : my_string.toCharArray()) {
            list.add(c);
        }
        
        Set<Character> set = new LinkedHashSet<Character>(list);
        
        for (Character c : set) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}