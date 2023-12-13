class Solution {
    public int solution(int n) {
        int answer = 0;        
        int bitCount = Integer.bitCount(n);

        for (int i = n+1; ; i++) {
            if (Integer.bitCount(i) == bitCount) {
                answer = i;
                break;                    
            }
        }
        
        return answer;
    }
}