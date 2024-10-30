import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(A);
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            long target = Long.parseLong(st.nextToken());
            
            int lt = 0;
            int rt = N-1;
            int check = 0;
            while(lt <= rt) {
                int mid = (lt+rt)/2;
                if(A[mid] > target) rt = mid-1;
                else if (A[mid] < target) lt = mid+1;
                else {
                    check = 1;
                    break;
                }
            }
            sb.append(check + "\n");
        }
        System.out.print(sb.toString());
    }
}