class Solution {
    static int answer;
    static int count;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        count = 0;
        visited = new boolean[dungeons.length];
        
        dfs(k, dungeons);
        
        return answer;
    }
    
    private void dfs(int hp, int[][] dungeons) {
        if (hp < 0 || answer == dungeons.length) {
            return;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                if (hp >= dungeons[i][0]) {
                    visited[i] = true;
                    count++;
                    answer = Math.max(answer, count);
                    dfs(hp - dungeons[i][1], dungeons);
                    if (count == dungeons.length) return;
                    visited[i] = false;
                    count--;
                }
            }
        }
    }
}