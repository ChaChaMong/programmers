class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i = 0; i < answer.length; i++) {
            String num = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            if (n > num.length()) {
                String blank = "";
                for (int j = 0; j < n - num.length(); j++) {
                    blank += "0";
                }
                
                num = blank + num;
            }
            
            num = num.replace("1", "#").replace("0", " ");
            
            answer[i] = num;
        }
        
        return answer;
    }
}