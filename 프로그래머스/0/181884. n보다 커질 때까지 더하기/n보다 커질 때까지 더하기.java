class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for (int item : numbers) {
            if (answer > n) break;            
            answer += item;
        }
        
        return answer;
    }
}