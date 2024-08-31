import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (String item : strArr) {
            if (!item.contains("ad")) {
                answer.add(item);
            }
        }
        
        return answer.toArray(String[]::new);
    }
}