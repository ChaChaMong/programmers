import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();
        int[] work = new int[progresses.length];
        
        int max = 0;
        int count = 0;
        for (int i = 0; i < work.length; i++) {
            work[i] = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                work[i]++;
            }
            
            if (i > 0 && work[i] > work[i - 1] && max < work[i]) {
                temp.add(count);
                max = 0;
                count = 0;
            }
            
            if (work[i] > max) {
                max = work[i];
            }
            
            count++;
        }
        
        temp.add(count);
        
        answer = temp.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}