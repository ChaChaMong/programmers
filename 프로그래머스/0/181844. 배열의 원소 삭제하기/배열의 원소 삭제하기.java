import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        List<Integer> arrList = new ArrayList<>();
        for (int item : arr) {
            arrList.add(item);
        }
        
        for (Integer item : delete_list) {
            if (arrList.contains(item)) {
                arrList.remove(item);
            }
        }
        
        return arrList.stream().mapToInt(i -> i).toArray();
    }
}