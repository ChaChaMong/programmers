import java.util.*;

class Solution {
    public Queue<String> queue = new PriorityQueue<>();
    boolean[] check;

    public String[] solution(String[][] tickets) {
        String[] answer = {};
        check = new boolean[tickets.length];

        dfs(tickets, 0, "ICN", "ICN");

        answer = queue.peek().split(" ");

        return answer;
    }

    public void dfs(String[][] tickets, int depth, String start, String total){
        if (depth == tickets.length) {
            queue.add(total);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!check[i] && start.equals(tickets[i][0])) {
                check[i] = true;
                dfs(tickets, depth + 1, tickets[i][1], total + " " + tickets[i][1]);
                check[i] = false;
            }
        }
    }
}