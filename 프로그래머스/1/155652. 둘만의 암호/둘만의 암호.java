class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";      
        for(char c : s.toCharArray()) {
            int move = index;
            while(move > 0) {
                c++;
                if(c > 'z') c=(char)(c-26);
                if(!skip.contains(c +"")) move--; 
            }
            answer+=c;
        }
        return answer;
    }
}