import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        
        int answer = 0;
        for(int i=0; i<N; i++) {
            int lt = 0;
            int rt = N-1;
            while(lt < rt) {
                int sum = A[lt] + A[rt];
                if(sum == A[i]) {
                    if(i == lt) {
                        lt++;
                        continue;
                    }
                    if(i == rt) {
                        rt--;
                        continue;
                    }
                    answer++;
                    break;
                } else if (sum < A[i]) {
                    lt++;
                } else if (sum > A[i]) {
                    rt--;
                }
            }
        }
        System.out.print(answer);
    }
}