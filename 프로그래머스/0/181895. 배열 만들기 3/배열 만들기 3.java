import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        
        for (int[] item : intervals) {
            for (int i = item[0]; i <= item[1]; i++) {
                answer.add(new Integer(arr[i]));
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}