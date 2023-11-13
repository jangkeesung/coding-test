import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int idx = 0;
        for (int i=0; i<arr.length; i++) {
            if (idx == k) break;
            boolean flag = true;
            for (int j=0; j<list.size(); j++) {
               if (list.get(j) == arr[i]) {
                   flag = false;
               }
            }
            if (flag) {
                list.add(arr[i]);
                idx++;
            }
        }
        
        if (list.size() < k) {
            for (int i=list.size(); i<k; i++) {
                list.add(-1);
            }
        }
        return list;
    }
}