import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2)->{
            int result = s1.charAt(n) - s2.charAt(n);
            return result != 0 ? result : s1.compareTo(s2);
        });
        return strings;
    }
}