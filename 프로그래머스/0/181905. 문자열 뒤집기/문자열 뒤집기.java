class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuffer answer = new StringBuffer();
        StringBuffer temp = new StringBuffer(my_string.substring(s, e + 1));
        answer.append(my_string.substring(0, s));
        answer.append(temp.reverse());
        answer.append(my_string.substring(e + 1, my_string.length()));
        
        return answer.toString();
    }
}