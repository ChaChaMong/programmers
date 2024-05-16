class Solution {
    int answer = 0;
        
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        dfs(0, 0, number, visited);        
        return answer;
    }
    
    private void dfs (int depth, int start, int[] number, boolean[] visited) {
        if (depth == 3) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    sum += number[i];
                    count++;
                }
                
                if (count == 3) break;
            }
            if (sum == 0) answer++;
            return;
        }
        
        for (int i = start; i < number.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, i + 1, number, visited);
                visited[i] = false;
            }
        }
    }
}