import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// [S/W 문제해결 기본] 1일차 - View 
public class N1206 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		for(int i=1; i<=10; i++) {
			int tc = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] arr = new int[tc];
			for(int j=0; j<tc; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			int result = 0; // 세대수 
			for(int j=2; j<arr.length-2; j++) {
				
				int[] num = new int[4]; 
				num[0] = arr[j] - arr[j-2];
				num[1] = arr[j] - arr[j-1];
				num[2] = arr[j] - arr[j+1];
				num[3] = arr[j] - arr[j+2];
				
				if(num[0]<0 || num[1]<0 || num[2]<0 || num[3]<0) continue;
				else {
					Arrays.sort(num);
					result += num[0];
				}
			}
			
			System.out.println("#"+i+" "+result);
		}
		
		
	}
}
