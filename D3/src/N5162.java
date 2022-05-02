import java.util.Scanner;

// 두가지 빵의 딜레마
public class N5162 {
	public static void main(String[] args) {
		
		//A원, B원 
		//예산 C원
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for(int i=1; i<=tc ;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A<B) {
				System.out.println("#"+i+" "+(C/A));
			}else {
				System.out.println("#"+i+" "+(C/B));
			}
		}
	}
}
