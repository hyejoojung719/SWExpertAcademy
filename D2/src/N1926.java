import java.util.Scanner;

// 간단한 369 게임
public class N1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		// 3 6 9 13 16 19 23 26 29 30 31 32 ... 39 43 46 49 53 56 59 ... 103 106 109.. 130.. 
		for(int i=1; i<=num; i++ ) {
			
			int cnt = 0;
			
			if(i < 10) {
				if(i%3==0) System.out.print("- ");
				else System.out.print(i + " ");
			}else {
				String numToStr = Integer.toString(i);
				String[] numArr = numToStr.split("");
				
				for(int j=0; j<numArr.length; j++) {
					if(numArr[j].equals("3") || numArr[j].equals("6") || numArr[j].equals("9")) {
						cnt++;
					}
				}
				
				if(cnt==0) System.out.print(i + " ");
				else {
					for(int k=0; k<cnt; k++) {
						System.out.print("-");
					}
					System.out.print(" ");
				}
			}
		}
		
	}
}
