import java.util.*;

class Solution {
    public long solution(long n) {
        char[] numArray = Long.toString(n).toCharArray();
        Arrays.sort(numArray);
        String reversedStr = new StringBuilder(new String(numArray)).reverse().toString();
        return Long.parseLong(reversedStr);
    }
}