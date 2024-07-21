class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for (int item : arr) {
            cnt += item;
        }
        
        int[] answer = new int[cnt];
        
        int idx = 0;
        for (int item : arr) {
            for (int i = 0; i < item; i++) {
                answer[idx] = item;
                idx++;
            }
        }
        
        return answer;
    }
}