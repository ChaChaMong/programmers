import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            if (map.containsKey(tangerine[i])) {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        
        Integer[] arrMap = new Integer[map.size()];
        int cnt = 0;
        for (Integer key : map.keySet()) {
            arrMap[cnt] = map.get(key);
            cnt++;
        }
        
        Arrays.sort(arrMap, Collections.reverseOrder());
        
        for (int i = 0; i < arrMap.length; i++) {
            k -= arrMap[i];
            answer++;
            
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}