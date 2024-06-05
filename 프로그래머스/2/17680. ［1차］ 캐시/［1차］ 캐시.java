import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        for (int i = 0; i < cities.length; i++) {  
            cities[i] = cities[i].toUpperCase();
            
            int pos = cache.indexOf(cities[i]);            
            if (pos >= 0) {
                answer+=1;
                cache.remove(pos);
                cache.add(cities[i]);
            } else if (cache.size() < cacheSize) {
                answer+=5;
                cache.add(cities[i]);
            } else {
                answer+=5;
                if (cacheSize > 0) {
                    cache.remove(0);
                    cache.add(cities[i]);
                }
            }
        }
        
        return answer;
    }
}