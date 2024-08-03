class Solution {
    public String[] solution(String[] names) {
        int length = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
        String[] answer = new String[length];
        
        int cnt = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[cnt] = names[i];
            cnt++;
        }
        
        return answer;
    }
}