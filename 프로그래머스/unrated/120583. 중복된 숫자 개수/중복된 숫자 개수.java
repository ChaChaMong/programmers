class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int value : array) {
            if (value == n) {
                answer++;
            }
        }
        
        return answer;
    }
}