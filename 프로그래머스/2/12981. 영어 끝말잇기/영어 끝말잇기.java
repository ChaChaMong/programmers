import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<String>();
        int pick = 0;
        
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || set.contains(words[i])) {
                pick = i;
                break;
            } else {
                set.add(words[i]);
            }
        }
        
        if (pick != 0) {
            answer[0] = pick % n + 1;
            answer[1] = pick / n + 1;
        }

        return answer;
    }
}