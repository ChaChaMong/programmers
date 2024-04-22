class Solution {
    int answer = 0;
    boolean[] check;

    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];

        dfs(words, begin, target, 0);

        return answer;
    }

    private void dfs(String[] words, String begin, String target, int count) {
        if (begin.equals(target)) {
            if (answer == 0 || count < answer) {
                answer = count;
            }
            return;
        }

        if (words.length == count) {
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!check[i] && differsByOneChar(begin, words[i])) {
                check[i] = true;
                dfs(words, words[i], target, count + 1);
                check[i] = false;
            }
        }
    }

    private boolean differsByOneChar(String str1, String str2) {
        int diff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}