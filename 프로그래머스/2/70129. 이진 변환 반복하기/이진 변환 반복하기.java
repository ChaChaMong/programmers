class Solution {
    public int[] solution(String s) {
        int[] answer = new int[]{0, 0};
        int temp;
        int removeCount;
        
        while(s.length() > 1) {
            answer[0]++;
            
            removeCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0'){
                   removeCount++;
                }
            }

            if(s == "1") {
                break;
            }
            
            temp = s.length() - removeCount;            
            s = Integer.toBinaryString(temp);

            answer[1] += removeCount;
        }

        return answer;
    }
}