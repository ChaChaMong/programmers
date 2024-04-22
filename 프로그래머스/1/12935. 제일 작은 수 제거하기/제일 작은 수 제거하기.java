import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            int min = arr[0];
            
            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
            }
            
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[cnt] = arr[i];  
                    cnt++;
                }
            }
        }
        
        return answer;
    }
}