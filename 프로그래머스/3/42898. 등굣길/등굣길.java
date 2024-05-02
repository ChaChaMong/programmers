class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] maps = new int[m][n];
        
        for (int i = 0; i < puddles.length; i++) {
            maps[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
        }
        
        maps[m - 1][n - 1] = 1;
        
        for (int i = m - 2; i >= 0; i--) {
            int x = i;
            int y = n - 1;
                            
            while(y >= 0 && x <= m - 1) {
                if (maps[x][y] >= 0) {
                    if (x + 1 <= m - 1 && maps[x + 1][y] >= 0) {
                        maps[x][y] += (maps[x + 1][y] % 1_000_000_007);
                    }
                    if (y + 1 <= n - 1 && maps[x][y + 1] >= 0) {
                        maps[x][y] += (maps[x][y + 1] % 1_000_000_007);
                    }
                }
                
                x++;
                y--;
            }
        }
             
        for (int i = n - 2; i >= 0; i--) {
            int x = 0;
            int y = i;
                            
            while(y >= 0 && x <= m - 1) {
                if (maps[x][y] >= 0) {
                    if (x + 1 <= m - 1 && maps[x + 1][y] >= 0) {
                        maps[x][y] += (maps[x + 1][y] % 1_000_000_007);
                    }
                    if (y + 1 <= n - 1 && maps[x][y + 1] >= 0) {
                        maps[x][y] += (maps[x][y + 1] % 1_000_000_007);
                    }
                }
                
                x++;
                y--;
            }
        }
        
        answer = maps[0][0] % 1_000_000_007;
        
        return answer;
    }
}