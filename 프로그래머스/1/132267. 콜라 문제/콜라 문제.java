class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        
        while (true) {
            n += remain;
            remain = n % a;
            n = (n / a) * b;
            
            answer += n;
            
            if ((n + remain) < a) break;
        }
        
        return answer;
    }
}