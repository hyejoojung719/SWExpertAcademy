import java.util.Scanner;

// 최대수 구하기
public class N2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int max ;
		for(int i=1; i<=t; i++) {
			max = 0;
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				if(max < num) {
					max = num;
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}
}
