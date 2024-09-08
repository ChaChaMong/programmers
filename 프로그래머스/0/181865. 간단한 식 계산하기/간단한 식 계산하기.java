class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] temp = binomial.split(" ");
        
        answer += Integer.parseInt(temp[0]);
        if (temp[1].equals("+")) {
            answer += Integer.parseInt(temp[2]);
        } else if (temp[1].equals("-")) {
            answer -= Integer.parseInt(temp[2]);
        } else if (temp[1].equals("*")) {
            answer *= Integer.parseInt(temp[2]);
        }
        
        return answer;
    }
}