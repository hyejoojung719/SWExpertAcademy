import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균값 구하기
public class N2071 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int sum;
		double avg;
		for(int i=1; i<=T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			sum=0;
			avg=0;
			for(int j=0; j<10; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			avg = sum/10.0;
			System.out.println("#"+i+" "+Math.round(avg));
		}
	}
}
