class Solution {
    public int solution(int[] stones, int k) {
        int left = 0;
        int right = 200_000_000;
        int result = 0;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            boolean check = false;
            int step = 0;
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] <= mid) {
                    step++;
                } else {
                    step = 0;
                }

                if (step >= k) {
                    check = true;
                    break;
                }
            }

            if (check) {
                right = mid;
                result = mid;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}