import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// Áø±âÀÇ ÃÖ°í±Þ ºØ¾î»§
public class N1860 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int j=0; j<N; j++) {
				list.add(Integer.parseInt(st2.nextToken()));
			}
			
			Collections.sort(list);
			
			boolean flag = true;
			for(int j=0; j<list.size(); j++) {
				int sum = K * (list.get(j)/M);
				if(sum < (j+1)) flag = false;
			}
			
			if(flag) System.out.println("#"+i+" Possible");
			else System.out.println("#"+i+" Impossible");
		}
	}
}
