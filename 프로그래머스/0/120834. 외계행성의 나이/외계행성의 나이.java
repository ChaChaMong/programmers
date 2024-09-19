class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String temp = Integer.toString(age);
        
        for (int i = 0; i < temp.length(); i++) {
            answer.append((char) ('a' + (temp.charAt(i) - '0')));
        }
        
        return answer.toString();
    }
}