class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] points = new int[4];
        int i=0;
        char preChar = 'C';
        for(char c : dartResult.toCharArray()) {
            System.out.print(c + ", ");
            if(Character.isDigit(c)) {
                if(Character.isDigit(preChar)) points[i-1] = 10;
                else points[i++] = c-'0';
            } else if(c == 'D') {
                points[i-1] = (int)Math.pow(points[i-1], 2);
            } else if(c == 'T') {
                points[i-1] = (int)Math.pow(points[i-1], 3);
            } else if(c == '*') {
                if(i>=2) {
                    points[i-1] *=2;
                    points[i-2] *=2;
                } else {
                    points[i-1] *=2;
                }
            } else if(c == '#') {
                points[i-1] *= -1;
            }
            preChar = c;
        }
        
        for(int n : points) {
            answer += n;
        }
        
        return answer;
    }
}