import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] x = new int[sizes.length];
        int[] y = new int[sizes.length];
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                x[i] = sizes[i][0];
                y[i] = sizes[i][1];
            } else {
                x[i] = sizes[i][1];
                y[i] = sizes[i][0];
            }
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        answer = x[x.length - 1] * y[y.length - 1];
        
        return answer;
    }
}