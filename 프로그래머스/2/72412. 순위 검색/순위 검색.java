import java.util.*;

class Solution {
    private Map<String, ArrayList<Integer>> mapInfo = new HashMap<String, ArrayList<Integer>>();
    
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        
        preprocessing(info);
        
        for (int i = 0; i < query.length; i++) {
            int lastBlankIndex = query[i].lastIndexOf(" ");
            String keyword = query[i].substring(0, lastBlankIndex);
            int number = Integer.parseInt(query[i].substring(lastBlankIndex + 1));

            if (mapInfo.containsKey(keyword)) {
                answer[i] = getCount(mapInfo.get(keyword), number);
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
    
    private int getCount(ArrayList<Integer> list, int number) {
        int left = 0;
        int right = list.size();
        int mid = (left + right) / 2;
        
        while (right > left) {
            if (list.get(mid) >= number) {
                right = mid;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        
        return list.size() - mid;
    }
    
    private void preprocessing(String[] info) {        
        for (int i = 0; i < info.length; i++) {
            String[] condition = info[i].split(" ");
            getQueryFormat(condition, "", 0);
        }
        
        for (String key : mapInfo.keySet()) {     
            Collections.sort(mapInfo.get(key));
        }
    }
    
    private void getQueryFormat(String[] condition, String str, int count) {
        if (count >= 4) {
            str = str.substring(0, str.lastIndexOf(" and"));
            if (!mapInfo.containsKey(str)) {
                ArrayList<Integer> list = new ArrayList<Integer>();
                mapInfo.put(str, list);
            }
            mapInfo.get(str).add(Integer.parseInt(condition[4]));
            return;
        }
        
        getQueryFormat(condition, str + "- and ", count + 1);
        getQueryFormat(condition, str + condition[count] + " and ", count + 1);
    }    
}