import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//±¸±¸´Ü2
public class N12221 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		for(int i=0; i<testCase; i++) {
			st =  new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a>=1 && a<=9 && b>=1 && b<=9) {
				System.out.println("#"+(i+1)+" "+(a*b));
			}else {
				System.out.println("#"+(i+1)+" -1");
			}
		}
		
		br.close();
	}
}
