import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int lt = 0;
            int rt = N-1;
            int check = 0;
            while(lt<=rt) {
                int mid = (lt+rt)/2;
                if(cards[mid] > target) rt = mid-1;
                else if (cards[mid] < target) lt = mid+1;
                else {
                    check = 1;
                    break;
                }
            }
            sb.append(check + " ");
        }
        System.out.println(sb.toString().trim());
    }
}