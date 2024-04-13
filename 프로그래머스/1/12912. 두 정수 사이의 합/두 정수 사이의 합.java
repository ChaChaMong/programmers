class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        
        if (a == b) {
            answer = a;
        } else if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        long minus = b - a;
        
        if (minus % 2 != 0) {
            answer = (a + b) * (minus + 1) / 2;
        } else {
            answer = (a + b) * (minus / 2) + (a + b) / 2;
        }
        
        return answer;
    }
}