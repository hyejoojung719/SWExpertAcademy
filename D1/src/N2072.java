import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Ȧ���� ���ϱ�
public class N2072 {
	public static void main(String[] args) throws Exception{
		// 10���� ���� �Է� �޾�
		// �� �� Ȧ���� ���� ���� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int testCase = Integer.parseInt(br.readLine());
		
		int sum;
		int num=0;
		int[] result = new int[testCase];
		for(int i=0; i<testCase; i++) {
			sum = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<10; j++) {
				num = Integer.parseInt(st.nextToken());
				
				if(num%2 == 1) {
					sum += num;
				}
			}
			
			result[i] = sum;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println("#"+(i+1)+ " " + result[i]);
		}
		
		br.close();
	}
}
