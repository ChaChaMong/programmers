class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int max = Math.max(M, N);
        int min = Math.min(M, N);
        
        answer += min - 1;
        answer += min * (max - 1);
        
        return answer;
    }
}