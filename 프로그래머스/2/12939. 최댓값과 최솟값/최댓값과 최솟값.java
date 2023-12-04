class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] list = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String item : list) {
            int value = Integer.parseInt(item);
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}