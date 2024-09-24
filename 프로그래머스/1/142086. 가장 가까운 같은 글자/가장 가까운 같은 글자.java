import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        int i=0;
        for(char c : s.toCharArray()) {
            int pre = map.getOrDefault(c, i);
            map.put(c, i);
            if(pre == i) answer[i] = -1;
            else         answer[i] = i - pre;
            i++;
        }
        
        return answer;
    }
}