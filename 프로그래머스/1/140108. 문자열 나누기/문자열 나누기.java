class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        char x = 'X';
        
        for(char c : s.toCharArray()) {
            if(cnt1 == 0) x = c;
            if(x == c) cnt1++;
            else cnt2++;
            
            if(cnt1 == cnt2) {
                answer++;
                cnt1 = 0;
                cnt2 = 0;
            }
        }
        if(cnt1 != cnt2) answer++;
        
        return answer;
    }
}