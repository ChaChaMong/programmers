class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        String temp = Integer.toString(a) + Integer.toString(b);
            
        answer = Math.max(answer, Integer.valueOf(temp).intValue());
        
        return answer;
    }
}