import java.util.Scanner;

// ��ȯ���� �����
public class N3431 {
	public static void main(String[] args) {
		
		// L�� �̻�, U�� ���� � �ؾ���
		// X�и�ŭ ����� �� 
		// ���� �Ǿ� �ִ� �ð��� ���� ��� �� ���̸� -1, �ƴϸ� �� �� �� ��� �ؾ��ϴ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=1; i<=tc; i++){
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			if(X>U) {
				System.out.println("#"+i+" "+-1);
			}else if(X>=L && X<=U) {
				System.out.println("#"+i+" "+0);
			}else {
				System.out.println("#"+i+" "+(L-X));
			}
		}
		
	}
}
