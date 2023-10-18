import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        answer = nums.length / 2 < map.size() ? nums.length / 2 : map.size();
        
        return answer;
    }
}