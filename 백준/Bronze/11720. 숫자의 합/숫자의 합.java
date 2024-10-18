import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nums = scan.next();
        int sum = 0;
        for(char c : nums.toCharArray()) {
            sum += c-'0';
        }
        System.out.println(sum);
    }
}