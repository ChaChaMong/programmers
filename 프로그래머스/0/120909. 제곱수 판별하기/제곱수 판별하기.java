class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        
        answer = (int)num == num ? 1 : 2;
        
        return answer;
    }
}