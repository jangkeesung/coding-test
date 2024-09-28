import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> deck1 = new LinkedList<>();
        Queue<String> deck2 = new LinkedList<>();
        for(String word : cards1) {
            deck1.add(word);
        }
        for(String word : cards2) {
            deck2.add(word);
        }
        for(String word : goal) {
            if(word.equals(deck1.peek())) {
                deck1.poll();
            } else if(word.equals(deck2.peek())) {
                deck2.poll();
            } else {
                return "No";
            }
        }
        return answer;
    }
}