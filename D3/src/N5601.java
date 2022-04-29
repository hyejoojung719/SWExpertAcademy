import java.util.Scanner;

// 쥬스나누기
public class N5601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int i=1; i<=tc; i++) {
			int n = sc.nextInt();
			
			System.out.print("#"+i+" ");
			for(int j=0; j<n; j++) {
				System.out.print("1/"+n+" ");
			}
			System.out.println();
		}
	}
}
