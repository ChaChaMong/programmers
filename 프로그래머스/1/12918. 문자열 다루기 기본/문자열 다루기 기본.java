import java.util.*;

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        if ((int)charArray[charArray.length - 1] < 48 ||
           (int)charArray[charArray.length - 1] > 57) {
            return false;
        }
        
        return true;
    }
}