import java.util.*;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i=l; i<=r; i++) {
            char[] cArr =(i+"").toCharArray();
            boolean flag = true;
            for (char c : cArr) {
                if (!(c == '0' || c =='5')) {
                    flag = false;
                } 
            }
            if (flag) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        return  list;
    }
}