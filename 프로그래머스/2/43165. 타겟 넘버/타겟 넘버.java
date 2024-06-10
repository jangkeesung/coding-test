class Solution {
    public int[] nums;
    public int tgt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        nums = numbers;
        tgt = target;
        answer = bfs(0, 0);
        return answer;
    }
    public int bfs(int idx, int sum) {
        if(idx == nums.length) {
            if(sum == tgt) return 1;
            else return 0;
        }
        int plus = sum + nums[idx];
        int minus = sum - nums[idx];
        return bfs(idx+1, plus) + bfs(idx+1, minus);
    }
}