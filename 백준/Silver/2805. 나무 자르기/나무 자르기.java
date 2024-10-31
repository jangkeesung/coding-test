import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        int max = 0;
        for(int i=0; i<N; i++) {
            int height = Integer.parseInt(st.nextToken());
            trees[i] = height;
            max = Math.max(height, max);
        }
        int answer = 0;
        int lt = 0;
        int rt = max;
        while(lt<=rt) {
            long sum = 0;
            int mid = (lt+rt)/2;
            for(int i=0; i<N; i++) {
                if(trees[i] >= mid) sum += trees[i] - mid;
            }
            if(sum < M) rt = mid - 1;
            else {
                answer = mid;
                lt = mid + 1;
            }
        }
        System.out.print(answer);
    }
}