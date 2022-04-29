import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// гу
public class N5642 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		for(int test_case=1; test_case<=tc; test_case++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = Integer.MIN_VALUE;
			int sum = 0;
//			for(int i=0; i<arr.length; i++) {
//				int sum = 0;
//				for(int j=i; j<arr.length; j++) {
//					sum += arr[j];
//					if(sum>max) max=sum;
//				}
//			}
			for(int i=0; i<n; i++) {
				
				sum += arr[i];
				if( sum > max ) max = sum;
				if( sum < 0 ) sum = 0;
				System.out.println("#"+arr[i]+" "+max);
			}
			System.out.println("#"+test_case+" "+max);
		}
		
		
	}
}
