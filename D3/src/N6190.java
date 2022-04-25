import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정곤이의 단조 증가하는 수
public class N6190 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[N];
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int max = -1 ;
			for(int j=0; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(max < arr[j]*arr[k]) {
						if(check(arr[j]*arr[k])) {
							max = arr[j]*arr[k];
						}
					}
				}
			}
			
			System.out.println("#" + (i+1) + " " + max);
			
			
		}
	}
	
	public static boolean check(int n) {
		int remain = n%10;
		n /= 10;
		
		while(n!=0) {
			if(n%10>remain) return false;
			remain = n%10; 
			n /= 10;
		}
		return true;
	}
}
