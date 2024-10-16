import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(String str : keymap) {
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                int min = Math.min(map.getOrDefault(c, i+1),i+1);
                map.put(c, min);
            }
        }
        for(int i=0; i<targets.length; i++) {
            for(char c : targets[i].toCharArray()) {
                if(map.get(c) == null) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(c);
            }
        }
        return answer;
    }
}