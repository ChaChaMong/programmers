
class Solution {
    public double solution(double n) {
        double answer = -1;
        double result = Math.sqrt(n);
        
        if (result == (int)result) {
            answer = Math.pow(result + 1, 2);
        }
        
        return answer;
    }
}