import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] cArr = a.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 96) {
                sb.append((char)((a.charAt(i) + 32)));
            } else {
                sb.append((char)((a.charAt(i) - 32)));
            }
        }
        System.out.print(sb.toString());
    }
}