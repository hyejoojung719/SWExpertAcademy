import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// °ÅµìÁ¦°ö
public class N1217 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		for(int i=1; i<=10; i++) {
			int tc = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int result = pow(a,b);
			
			System.out.println("#"+i+" "+result);
		}
	}
	
	public static int pow(int a, int b) {
		if(b == 1) {
			return a;
		}
		
		return a*pow(a,b-1);
	}
}
