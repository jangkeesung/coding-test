import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int lt = 1;
        int rt = 0;
        int sum = 0;
        int answer = 0;
        while(rt <= N) {
            if(sum > N) {
                sum -= lt;
                lt++;
            } else if(sum < N) {
                rt++;
                sum += rt;
            } else {
                answer++;
                rt++;
                sum += rt;
            }
        }
        System.out.print(answer);
    }
}