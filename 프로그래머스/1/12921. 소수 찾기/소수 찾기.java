class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=3; i<=n; i+=2) {
            for(int j=3; j*j<=i; j++) {
                if(i%j==0) {answer--; break;}
            }
            answer++;
        }
        return answer;
    }
}