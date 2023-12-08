class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String [] split = s.split(" ");

        for(String st : split){

            if(!st.equals("")){
                if(st.charAt(0) >= 'a' && st.charAt(0) <='z'){
                     answer += st.toUpperCase().charAt(0) + st.substring(1,st.length());
                }else{
                    answer += st;
                }
            }
           answer += " ";

        }
        if(s.charAt(s.length()-1) != ' '){
            answer = answer.trim();
        }
        return answer;
    }
}