class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int hit = 0;
        int zero = 0;
        for(int lnum : lottos) {
            if(lnum == 0) {
                zero++;
                continue;
            }
            for(int wnum : win_nums) {
                if(lnum == wnum) {
                    hit++;
                    break;
                }
            }
        }
        int high = 7-(hit+zero);
        int low = 7-hit;
        answer[0] = high == 7 ? 6 : high;
        answer[1] = low == 7 ? 6 : low;
        return answer;
    }
}