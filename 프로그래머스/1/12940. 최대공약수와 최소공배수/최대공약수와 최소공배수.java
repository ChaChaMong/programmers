class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        for (int i = min; i > 0; i--) {
            if (min % i == 0 && max % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        answer[1] = min * max / answer[0];
        
        return answer;
    }
}