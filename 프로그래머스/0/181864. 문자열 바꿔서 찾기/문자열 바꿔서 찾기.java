class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String reverse = pat;
        reverse = reverse.replaceAll("A", "C");
        reverse = reverse.replaceAll("B", "A");
        reverse = reverse.replaceAll("C", "B");
        
        return myString.contains(reverse) ? 1 : 0;
    }
}