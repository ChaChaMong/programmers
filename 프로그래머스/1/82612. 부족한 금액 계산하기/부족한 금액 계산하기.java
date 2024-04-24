class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long countNum = 0;
        
        countNum += ((count / 2) * (count + 1));
        if (count % 2 == 1) {
            countNum += (count / 2 + 1);
        }
        
        answer = price * countNum - money;
        
        if (answer < 0) {
            answer = 0;
        }
        
        return answer;
    }
}