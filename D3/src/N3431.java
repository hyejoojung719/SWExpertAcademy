import java.util.Scanner;

// 준환이의 운동관리
public class N3431 {
	public static void main(String[] args) {
		
		// L분 이상, U분 이하 운동 해야함
		// X분만큼 운동했을 때 
		// 제한 되어 있는 시간을 넘은 운동을 한 것이면 -1, 아니면 몇 분 더 운동을 해야하는지 출력
		
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
