class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        
        max1 = Math.max(wallet[0], wallet[1]);
        max2 = Math.max(bill[0], bill[1]);
        min1 = Math.min(wallet[0], wallet[1]);
        min2 = Math.min(bill[0], bill[1]);
        
        while(true) {
            if(max1 >= max2 && min1 >= min2) break;
            else {
                answer++;
                int temp = max2;
                max2 = Math.max(temp/2,min2);
                min2 = Math.min(temp/2,min2);
            }
        }
        
        
        return answer;
    }
}