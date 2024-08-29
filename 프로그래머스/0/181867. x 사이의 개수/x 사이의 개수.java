class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x", -1);
        int[] answer = new int[temp.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp[i].length();
        }
        
        return answer;
    }
}