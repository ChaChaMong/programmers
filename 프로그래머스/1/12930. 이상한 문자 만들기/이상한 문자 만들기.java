class Solution {
    public String solution(String s) {
        String answer = "";
        boolean headCheck = false;
        int headIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (!headCheck && s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                headCheck = true;
                headIndex = i;
            }
            
            if (s.charAt(i) == ' ') {
                answer += " ";
                headCheck = false;
            } else if (headCheck && s.charAt(i) != ' ' && (i - headIndex) % 2 == 0) {
                answer += Character.toUpperCase(s.charAt(i));
            } else if (headCheck && s.charAt(i) != ' ' && (i - headIndex) % 2 != 0) {
                answer += Character.toLowerCase(s.charAt(i));
            }
        }
        
        return answer;
    }
}