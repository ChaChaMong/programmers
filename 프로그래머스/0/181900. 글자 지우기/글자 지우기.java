class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder temp = new StringBuilder(my_string);
        
        for (int i = 0; i < indices.length; i++) {
            temp.setCharAt(indices[i], ' ');
        }
        
        answer = temp.toString();
        answer = answer.replaceAll(" ", "");        
        
        return answer;
    }
}