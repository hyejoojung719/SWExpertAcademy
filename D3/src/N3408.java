import java.util.Scanner;

// ������ �� ���ϱ�
public class N3408 {
	public static void main(String[] args) {
		
		// S1 = ���� ���� �� ���� ������� N���� ��
		// S2 = ���� ���� �� Ȧ���ΰ͵� �߿��� ���� ������� N���� ��
		// S3 = ���� ���� �� ¦���ΰ͵� �߿��� ���� �����뷯 N���� ��
		
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
