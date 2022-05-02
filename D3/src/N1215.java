import java.util.Scanner;

// 회문1
public class N1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[8][8];

		for(int tc=1; tc<=10; tc++) {
			int len = Integer.parseInt(sc.nextLine()); // 몇글자로 이루어진 회문을 찾을지..


			// 문자 입력받음
			for(int i=0; i<8; i++) {
				String str = sc.nextLine();

				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			// 회문 길이가 1인 경우
			if(len == 1) {
				System.out.println("#"+tc+" "+64);
			}

			// 회문 길이가 1이 아닌경우
			int result = 0;
			// 가로 탐색
			for(int i=0; i<8; i++) {
				for(int j=0; j<8-len+1; j++) {
					int tmp=0;
					for(int k=0; k<len/2; k++) {
						if(arr[i][j+k]!=arr[i][j+len-k-1]) {
							tmp = -1;
						}
					}
					if(tmp==0) {
						result++;
					}
				}
			}

			// 세로 탐색
			for(int i=0; i<8-len+1; i++) {
				for(int j=0; j<8; j++) {
					int tmp=0;
					for(int k=0; k<len/2; k++) {
						if(arr[i+k][j]!=arr[i+len-k-1][j]) {
							tmp = -1;
						}
					}
					if(tmp==0) {
						result++;
					}
				}
			}
			
			System.out.println("#"+tc+" "+result);

		}
	}
}
