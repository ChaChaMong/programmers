class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i = 0; i < answer.length; i++) {
            String num = Integer.toBinaryString(arr1[i] | arr2[i]);            
            num = String.format("%" + n + "s", num);            
            num = num.replace("1", "#").replace("0", " ");
            
            answer[i] = num;
        }
        
        return answer;
    }
}