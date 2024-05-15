import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] item : clothes) {
            if (map.containsKey(item[1])) {
                map.put(item[1], map.get(item[1]) + 1);    
            } else {
                map.put(item[1], 1);    
            }
        }
        
        System.out.println(map);

        for (String strKey : map.keySet()) {
            answer *= (map.get(strKey) + 1);
        }
        
        answer--;
        
        return answer;
    }
}