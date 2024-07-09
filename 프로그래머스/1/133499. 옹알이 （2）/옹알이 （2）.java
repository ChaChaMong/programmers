class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = new String[] {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String s : baby) {
                babbling[i] = babbling[i].replaceAll(s, "|");
                if (babbling[i].contains("||")) {
                    break;
                } else {
                    babbling[i] = babbling[i].replaceAll("\\|", " ");
                }
            }

            if (!babbling[i].contains("||")) {
                babbling[i] = babbling[i].replaceAll(" ", "");

                if (babbling[i].isEmpty()) {
                    answer++;
                }
            }
        }

        return answer;
    }
}