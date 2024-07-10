import java.util.HashMap;
import java.util.Map;

class Solution {
    
    public int solution(String s) {
        int answer = 0;

        while(!s.isEmpty()) {
            Map<Character, Integer> map = new HashMap<>();
            Character first = s.charAt(0);
            map.put(s.charAt(0), 1);
            s = s.substring(1);

            while(map.get(first) != 0 && !s.isEmpty()) {
                if (map.containsKey(s.charAt(0))) {
                    map.put(first, map.get(first) + 1);
                    s = s.substring(1);
                } else {
                    map.put(first, map.get(first) - 1);
                    s = s.substring(1);
                }
            }

            answer++;
        }
        
        return answer;
    }
}