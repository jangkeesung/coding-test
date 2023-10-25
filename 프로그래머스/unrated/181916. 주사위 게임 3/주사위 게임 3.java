import java.util.*;
class Solution {
    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int solution(int a, int b, int c, int d) {
        int[] numArr = {a,b,c,d};
        
        for (int num : numArr) {
            for (int i=0; i<6; i++) {
                int key = i + 1;
                if (key == num && map.get(key) == null) {
                    map.put(key, 1);
                } else if (key == num && map.get(key) != null) {
                    map.put(key, map.get(key) + 1);
                }
            }    
        }
        if (getKey(4, 0) > 0) {
            return getKey(4, 0) * 1111;
        }
        if (getKey(3, 0) > 0) {
            return (getKey(3, 0)*10 + getKey(1, 0))*(getKey(3, 0)*10 + getKey(1, 0));
        }
        if (getKey(2, getKey(2, 0)) > 0) {
            return (getKey(2, 0) + getKey(2, getKey(2, 0))) * Math.abs(getKey(2, 0) - getKey(2, getKey(2, 0)));
        }
        if (getKey(2, 0) > 0 && getKey(2, getKey(2, 0)) == 0) {
            return getKey(1,0) * getKey(1, getKey(1,0));
        } else {
            return getKey(1,0);
        }

    }
    private int getKey(int n, int x) {
        for (int i=0; i<6; i++) {
            int key = i + 1;
            if (map.get(key) != null && map.get(key) == n && key != x) {
                return key;
            }
        }
        return 0 ;
    }
}