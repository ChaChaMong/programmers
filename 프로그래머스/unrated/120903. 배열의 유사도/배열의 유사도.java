class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (String v1 : s1) {
            for (String v2 : s2) {
                if (v1.equals(v2)) {
                    answer++;
                    break;
                } 
            }
        }
        
        return answer;
    }
}