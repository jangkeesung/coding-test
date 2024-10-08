class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int i=0;
        System.out.println('a'-'A');
        for(char c : s.toCharArray()){
            if(c == ' ') {
                answer.append(c);
                i=0;
            } else {
                if(i%2==0) {
                    answer.append((c+"").toUpperCase());
                } else {
                    answer.append((c+"").toLowerCase());
                }
                i++;
            }
        }
        
        
        return answer.toString();
    }
}