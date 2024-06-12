class Solution {
    public int solution(int a, int b, int n) {
        if(n < a) return 0;
        int rest = n % a;
        n = n/a*b;
        return n + solution(a, b, n+rest);
    }
}