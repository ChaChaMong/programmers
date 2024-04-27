class Solution {
    public int solution(int[] arr) {
        if (arr.length == 0) {
            return arr[0];
        }
        
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lcm = getLcm(Math.min(lcm, arr[i]), Math.max(lcm, arr[i]));
        }
        
        return lcm;
    }
    
    private int getLcm(int n, int m) {
        int min = 0;
        int max = 0;
        
        for (int i = n; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                max = i;
                break;
            }
        }
        
        min = n * m / max;
        
        return min;
    }
}