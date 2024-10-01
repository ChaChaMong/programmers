import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] temp = myString.split("x");
        String[] answer;
        int cut = 0;
        
        Arrays.sort(temp);
        
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")) {
                cut = i;
                break;
            }
        }
        
        answer = new String[temp.length - cut];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp[cut + i];
        }
        
        return answer;
    }
}