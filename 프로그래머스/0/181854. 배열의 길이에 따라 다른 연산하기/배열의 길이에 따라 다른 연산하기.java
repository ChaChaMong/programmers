class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if ((arr.length + i) % 2 == 0) {
                answer[i] = arr[i];
            } else {
                answer[i] = arr[i] + n;
            }
        }
        
        return answer;
    }
}