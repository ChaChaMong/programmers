class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        
        for (String item : str_list) {
            if (!item.contains(ex)) {
                answer.append(item);
            }
        }
        
        return answer.toString();
    }
}