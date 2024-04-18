class Solution {
    public int solution(int num) {
        int answer = 0;
        long lnum = num;
        
        for (int i = 0; i <= 500; i++) {
            answer = i;
            
            if (lnum == 1) {
                break;
            }
            
            if (lnum % 2 == 0) {
                lnum /= 2;
            } else {
                lnum = lnum * 3 + 1;
            }            
        }
        
        if (lnum != 1) {
            answer = -1;
        }
        
        return answer;
    }
}