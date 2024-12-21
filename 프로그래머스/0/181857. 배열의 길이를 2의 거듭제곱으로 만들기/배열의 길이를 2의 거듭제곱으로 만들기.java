class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int length = 1;
        while (length < arr.length) {
            length *= 2;
        }
        
        answer = new int[length];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}