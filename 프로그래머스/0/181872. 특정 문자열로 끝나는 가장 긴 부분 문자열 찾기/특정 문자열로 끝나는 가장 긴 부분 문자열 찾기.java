class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = myString.length(); i >= 0; i--) {
            String temp = myString.substring(i - pat.length(), i);
            
            if (temp.equals(pat)) {
                answer = myString.substring(0, i);
                break;
            }
        }
        
        
        return answer;
    }
}