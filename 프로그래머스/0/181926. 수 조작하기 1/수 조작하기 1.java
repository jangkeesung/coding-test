class Solution {
    public int solution(int n, String control) {
        int answer = n;
        for(char c : control.toCharArray()) {
            int val = 0;
            if(c == 'w') val = 1;
            else if(c == 's') val = -1;
            else if(c == 'd') val = 10;
            else if(c == 'a') val = -10;
            answer += val;
        }
        return answer;
    }
}