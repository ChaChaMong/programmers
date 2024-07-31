import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Double> rate = new HashMap<>();
        
        Arrays.sort(stages);
        
        for (int i = 1; i <= N; i++) {
            map.put(i, 0);
            rate.put(i, 0.0);
            answer[i - 1] = i;
        }
        
        for (int i = 0; i < stages.length; i++) {
            if (map.containsKey(stages[i])) {
                map.put(stages[i], map.get(stages[i]) + 1);
            }
        }
        
        int preCount = 0;
        for (Integer i : map.keySet()) {
            rate.put(i, (double) map.get(i) / (stages.length - preCount));
            preCount += map.get(i);
        }
        
        // 단순 선택 정렬로 정렬 수행
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 값 비교
                double valueI = rate.get(answer[i]);
                double valueJ = rate.get(answer[j]);

                if (valueI < valueJ || (valueI == valueJ && answer[i] > answer[j])) {
                    // swap
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}