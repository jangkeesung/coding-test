import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] R = new long[M];
        st = new StringTokenizer(br.readLine());
        long sum = 0;
        for(int i=0; i<N; i++) {
            sum += Integer.parseInt(st.nextToken());
            int rest = (int)(sum % M);
            R[rest]++;
        }
        long answer = R[0];
        for(int i=0; i<M; i++) {
            if(R[i]>0) {
                answer += R[i] * (R[i]-1) / 2;
            }
        }
        System.out.print(answer);
    }
}