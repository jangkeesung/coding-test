import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<(k>score.length ? score.length : k); i++) {
            list.add(score[i]);
            min = Math.min(score[i], min);
            answer[i] = min;
        }
        list.sort(Comparator.reverseOrder());
        for(int i=k; i<score.length; i++) {
            for(int j=0; j<k; j++) {
                if(score[i] > list.get(j)) {
                    list.add(j, score[i]);
                    break;
                }
            }
            answer[i] = list.get(k-1);
        }
        return answer;
    }
}