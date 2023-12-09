class Solution {
    public int[] solution(String s) {
        int[] answer = new int[]{0, 0};
        int temp;
        
        while(!s.equals("1")) {
            
            answer[1] += s.length();
            s = s.replaceAll("0","");
            temp = s.length();
            answer[1] -= temp;
            
            s = Integer.toBinaryString(temp);
            
            answer[0]++;
        }
        
        return answer;
    }
}