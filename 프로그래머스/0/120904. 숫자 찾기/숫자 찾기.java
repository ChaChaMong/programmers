class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String sNum = Integer.toString(num);
        
        for (int i = 0; i < sNum.length(); i++) {
            if(sNum.charAt(i) == k + '0') {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}