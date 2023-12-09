class Solution {
    public int[] solution(String s) {
        int[] answer = new int[]{0, 0};
        int loofCount = 0;
        
        while(s.length() > 1) {
            int removeCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0'){
                   removeCount++;
                }
            }

            int length = s.length() - removeCount;            
            s = Integer.toBinaryString(length);

            answer[0]++;
            if(s == "1") {
                break;
            }
            
            answer[1] += removeCount;
        }
        
        return answer;
    }
}