import java.util.Scanner;

// 세가지 합 구하기
public class N3408 {
	public static void main(String[] args) {
		
		// S1 = 양의 정수 중 작은 순서대로 N개의 합
		// S2 = 양의 정수 중 홀수인것들 중에서 작은 순서대로 N개의 합
		// S3 = 양의 정수 중 짝수인것들 중에서 작은 순서대러 N개의 합
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=1; i<=tc ; i++) {
			long N = sc.nextInt();
		
			long s1 = (N*(N+1))/2;
			long s2 = (N*(N+1))-N;
			long s3 = N*(N+1);
			
			System.out.println("#"+i+" "+s1+" "+s2+" "+s3);
		}
	}
}
