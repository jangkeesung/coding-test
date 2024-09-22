class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            char cizar = ' ';
            if((c>='A' && c<='Z')){
                cizar = (char)(c+n);
                if(cizar > 'Z') cizar = (char)(cizar - 26);
            }else if((c>='a' && c<= 'z')){
                cizar = (char)(c+n);
                if(cizar > 'z') cizar = (char)(cizar - 26);
            }
            sb.append(cizar);
        }
        answer = sb.toString();
        return answer;
    }
}