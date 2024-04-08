class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c == 'p' || c == 'P') {
                p++;
            } else if (c == 'y' || c == 'Y') {
                y++;
            }
        }
        
        if (p != y) {
            answer = false;
        }

        return answer;
    }
}