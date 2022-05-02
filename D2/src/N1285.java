import java.util.Arrays;
import java.util.Scanner;

// 아름이의 돌 던지기 -> 자바 없어서 못품
public class N1285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int t=1; t<=tc; t++) {
			int n = sc.nextInt();
		
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				int input = sc.nextInt();
				int num = Math.abs(input);
				
				int dis = num-0;
				
				arr[i] = dis;
			}
			
			Arrays.sort(arr);
			for(int i=0; i<arr.length; i++) {
				System.out.println("값 : "+ arr[i]);
			}
			
			int idx=1;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]==arr[i+1]) {
					idx++;
				}
			}
			
			System.out.println("#"+t+" "+arr[0]+" "+idx);
		}
	}
}
