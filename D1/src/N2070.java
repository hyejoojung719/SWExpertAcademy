import java.util.Scanner;

// ū ��, ���� ��, ���� ��
public class N2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a < b) {
				System.out.println("#"+i+" <");
			}else if(a == b) {
				System.out.println("#"+i+" =");
			}else {
				System.out.println("#"+i+" >");
			}
		}
	}
}
