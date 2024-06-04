class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int point = 0;
        
        for (int i = 0; i < section.length; i++) {
            if (section[i] > point) {
                answer++;
                point = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}