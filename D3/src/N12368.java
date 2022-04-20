import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24½Ã°£
public class N12368 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int h1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			
			System.out.println( "#" + (i+1) + " "+ (h1+h2-(24*((h1+h2)/24))));
		}
		
		br.close();
	}
}
