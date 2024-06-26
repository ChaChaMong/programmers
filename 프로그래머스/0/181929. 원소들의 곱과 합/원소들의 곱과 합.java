class Solution {
    public int solution(int[] num_list) {
        double sum = 0;
        int mul = 1;
        
        for (int num : num_list) {
            sum += num;
            mul *= num;
        }
        
        sum = Math.pow(sum, 2);
        
        return mul < sum ? 1 : 0;
    }
}