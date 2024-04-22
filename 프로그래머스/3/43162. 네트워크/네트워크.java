class Solution {
    boolean[] visit;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        
        for (int  i = 0; i < n; i++) {
            if (!visit[i]) {
                dfs(computers, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int[][] computers, int node) {
        visit[node] = true;
        
        for (int i = 0; i < computers[node].length; i++) {
            if (!visit[i] && computers[node][i] == 1) {
                dfs(computers, i);
            }
        }
    }
}