import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백만장자프로젝트
public class N1859 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 위치 중요
			
			int[] arr = new int[N];
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			long sum = 0;
			for(int j = N-1; j >= 0; j--) {
				if(max < arr[j]) {
					max = arr[j];
				}else {
					sum += (max - arr[j]);
				}
			}
			
			System.out.println("#" + (i+1) + " " + sum);
			
		}
	}
}
