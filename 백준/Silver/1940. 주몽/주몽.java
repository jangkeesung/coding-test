import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] I = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            I[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(I);
        
        int lt = 0;
        int rt = N-1;
        int answer = 0;
        
        while(lt<rt) {
            int sum = I[lt] + I[rt];
            if(sum == M) {
                answer++;
                lt++; rt--;
            } else if (sum < M) {
                lt++;
            } else if (sum > M) {
                rt--;
            }
        }
        System.out.print(answer);
    }
}