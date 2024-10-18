import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int score = sc.nextInt();
            sum += score;
            max = Math.max(max, score);
        }
        double avg = sum * 100.0/max/n;
        System.out.println(avg);
    }
}