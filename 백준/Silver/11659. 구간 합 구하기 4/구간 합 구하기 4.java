import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] S = new int[N+1];
        int sum = 0;
        for(int i=1; i<=N; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
            S[i] = sum;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            
            sb.append(S[n2] - S[n1-1]);
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
    }
}