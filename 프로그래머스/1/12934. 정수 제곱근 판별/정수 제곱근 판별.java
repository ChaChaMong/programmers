
class Solution {
    public long solution(long n) {
        long answer = -1;
        double result = Math.sqrt(n);
        
        if (result == (int) result) {
            answer = (long) Math.pow(result + 1, 2);
        }
        
        return answer;
    }
}