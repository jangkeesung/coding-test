class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = "" + a + b;
        String num2 = "" + b + a;
        return Math.max(Integer.parseInt(num1),Integer.parseInt(num2));
    }
}