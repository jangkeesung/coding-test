class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++) {
            //약수의 개수
            int cnt = 0;
            for(int j=1; j*j<=i; j++) {
                if(j*j==i) cnt++;
                else if(i%j==0) cnt+=2;
            }
            //limit인지 확인
            if(cnt>limit) cnt=power;
            //개수 또는 power 연산
            answer+=cnt;
        }
        return answer;
    }
}