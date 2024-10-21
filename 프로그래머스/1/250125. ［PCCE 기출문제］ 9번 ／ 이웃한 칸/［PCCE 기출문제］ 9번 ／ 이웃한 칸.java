class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        for(int i=0; i<4; i++) {
            if(h+dx[i]>=0 && w+dy[i]>=0 && h+dx[i]<board[0].length && w+dy[i]<board.length) {
                if(board[h+dx[i]][w+dy[i]].equals(board[h][w])) answer++;
            }
        }
        return answer;
    }
}