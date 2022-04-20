import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// µÎÀü±¸
public class N12741 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			if(a<=c && c<b && b<d) {
				System.out.println("#"+(i+1) + " " + (b-c));
			}else if(c<=a && a<d && d<b) {
				System.out.println("#"+(i+1) + " " + (d-a));
			}else if(a<=c && d<=b) {
				System.out.println("#"+(i+1) + " " + (d-c));
			}else if(c<=a && b<=d) {
				System.out.println("#"+(i+1) + " " + (b-a));
			}else {
				System.out.println("#"+(i+1) + " " + 0);
			}
		}
		
		br.close();
	}
}
