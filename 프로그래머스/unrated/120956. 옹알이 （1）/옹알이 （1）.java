class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sBabbling = new String[] {"aya", "ye", "woo", "ma"};

        for (String value : babbling) {
            for (String sValue : sBabbling) {
                value = value.replace(sValue, " ");
            }
            value = value.trim();

            if (value.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}