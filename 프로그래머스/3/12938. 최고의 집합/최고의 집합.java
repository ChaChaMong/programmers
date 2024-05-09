class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        if (s / n == 0) {
            return new int[]{-1};
        } else {
            int avg = s / n;
            int mod = s % n;
            
            for (int i = 0; i < n - mod; i++) {
                answer[i] = avg;
            }
            
            for (int i = n - mod; i < n; i++) {
                answer[i] = avg + 1;
            }
        }
        
        return answer;
    }
}