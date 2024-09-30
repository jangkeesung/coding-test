import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(list.contains(num)) answer++;
                    else {
                        int cnt = 1;
                        for(int l=2; l*l<=num; l++) {
                            if(l*l==num) cnt++;
                            else if(num%l==0) {cnt++; break;}
                        }
                        if(cnt == 1) {
                            list.add(num);
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
}