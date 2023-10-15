class Solution {
    public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int num = 1;
		
		int x = 0;
		int y = 0;
		int cs = 0; // 0~3 까지 4가지 케이스
		int cnt = 0;
		
		while (num <= n * n) {
			
			answer[y][x] = num;
			num++;
			
			if (cs == 0) {
				if (x == n - cnt - 1) {
					y++;
					cs = 1;
					continue;
				} else {
					x++;				
				}
			}
			
			if (cs == 1) {
				if (y == n - cnt - 1) {
					x--;
					cs = 2;
					continue;
				} else {				
					y++;
				}
			}
			
			
			if (cs == 2) {
				if (x == cnt) {
					cnt++;
					y--;
					cs = 3;
					continue;
				} else {
					x--;				
				}
			}
			
			if (cs == 3) {
				if (y == cnt) {
					x++;
					cs = 0;
					continue;
				} else {
					y--;				
				}
			}

		}
        return answer;
    }
}