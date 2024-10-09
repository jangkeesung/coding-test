class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] dup = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String bab : babbling) {
            //중복단어 유무 검사
            for(int i=0; i<4; i++) {
                if(bab.contains(dup[i])) {
                    bab="DUP";
                    break;
                }
            }
            //중복 시 다음
            if(bab.equals("DUP")) continue;

            //미중복 시 단어 검사
            for(int i=0; i<4; i++) {
                bab = bab.replace(words[i], "0");
            }
            bab = bab.replace("0", "");
            

            //단어 적합 시 카운트
            if(bab.equals("")) answer++;
        }
        return answer;
    }
}