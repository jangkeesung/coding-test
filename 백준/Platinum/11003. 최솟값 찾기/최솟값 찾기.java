import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Node> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        deque.add(new Node(0, A[0]));
        sb.append(A[0]);
        sb.append(" ");
        for(int i=1; i<N; i++) {
            while(!deque.isEmpty() && deque.getLast().num > A[i]) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, A[i]));
            while(!deque.isEmpty() && deque.getFirst().idx <= i - L) {
                deque.removeFirst();
            }
            sb.append(deque.getFirst().num);
            sb.append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}

class Node {
    public int idx;
    public int num;
    
    public Node(int idx, int num) {
        this.idx = idx;
        this.num = num;
    }
    
}