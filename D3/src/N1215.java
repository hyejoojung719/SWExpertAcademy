import java.util.Scanner;

// ȸ��1
public class N1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[8][8];

		for(int tc=1; tc<=10; tc++) {
			int len = Integer.parseInt(sc.nextLine()); // ����ڷ� �̷���� ȸ���� ã����..


			// ���� �Է¹���
			for(int i=0; i<8; i++) {
				String str = sc.nextLine();

				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			// ȸ�� ���̰� 1�� ���
			if(len == 1) {
				System.out.println("#"+tc+" "+64);
			}

			// ȸ�� ���̰� 1�� �ƴѰ��
			int result = 0;
			// ���� Ž��
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

			// ���� Ž��
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
