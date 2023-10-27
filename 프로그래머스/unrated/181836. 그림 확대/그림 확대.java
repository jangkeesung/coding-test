class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for (int i=0; i<picture.length; i++) {
            StringBuilder sb = new StringBuilder("");
            for(int j=0; j<picture[0].length(); j++) {
                for (int l=0; l<k; l++) {
                    sb.append(picture[i].substring(j,j+1));
                }
            }
            for(int j=0; j<k; j++) {
                answer[i*k+j] = sb.toString();
                System.out.println(sb);
            }
        }
        return answer;
    }
}