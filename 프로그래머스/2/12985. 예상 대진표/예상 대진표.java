class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        int left = Math.min(a, b);
        int right = Math.max(a, b);
        
        while (true) {
            answer++;
            if (left + 1 == right && left % 2 == 1) {
                break;
            }
            
            if (left % 2 == 1) {
                left = left / 2 + 1;
            } else {
                left = left / 2;
            }

            if (right % 2 == 1) {
                right = right / 2 + 1;
            } else {
                right = right / 2;
            }
        }
        
        
        return answer;
    }
}