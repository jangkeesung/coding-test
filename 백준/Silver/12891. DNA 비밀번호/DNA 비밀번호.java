import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Map<Character, Integer> map = new HashMap<>();
        String DNA = br.readLine();
        st = new StringTokenizer(br.readLine());
        map.put('A', Integer.parseInt(st.nextToken()));
        map.put('C', Integer.parseInt(st.nextToken()));
        map.put('G', Integer.parseInt(st.nextToken()));
        map.put('T', Integer.parseInt(st.nextToken()));
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<P-1; i++) {
            char c = DNA.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        int answer = 0;
        int lt = 0;
        int rt = P-1;
        while(rt < S) {
            
            char rc = DNA.charAt(rt++);
            map2.put(rc, map2.getOrDefault(rc,0)+1);
            
            boolean boolA = map.get('A') <= map2.getOrDefault('A',0);
            boolean boolC = map.get('C') <= map2.getOrDefault('C',0);
            boolean boolG = map.get('G') <= map2.getOrDefault('G',0);
            boolean boolT = map.get('T') <= map2.getOrDefault('T',0);
            
            if(boolA && boolC && boolG && boolT) answer++;
            
            char lc = DNA.charAt(lt++);
            map2.put(lc, map2.get(lc)-1);
            
        }
        System.out.print(answer);
    }
}