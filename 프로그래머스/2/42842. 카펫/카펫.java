class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        int x = brown / 2;
        int y = 0;
        
        while (x >= y) {
            x -= 1;
            if (sum % x == 0) {
                y = sum / x;
                
                if ((x * 2 + (y - 2) * 2) == brown){
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }
        
        return answer;
    }
}