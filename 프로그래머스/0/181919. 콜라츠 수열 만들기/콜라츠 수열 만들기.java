import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(list.get(list.size() - 1) != 1) {
            if(list.get(list.size() - 1) % 2 == 0) {
                list.add(list.get(list.size() - 1) / 2);
            } else {
                list.add(list.get(list.size() - 1) * 3 + 1);
            }
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}