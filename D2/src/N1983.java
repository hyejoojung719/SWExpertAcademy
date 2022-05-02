import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// ������ ���� �ű��
public class N1983 {
	static String[] sc = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
	public static void main(String[] args) throws Exception{
		// ���� = �߰� 35% + �⸻ 45% + ���� 20%
		// ���������� 10���� ���� �ο�
		// N/10�ְ� ������ ���� �ο� ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		
		for(int t=1; t<=tc; t++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st1.nextToken()); // �л���
			int k = Integer.parseInt(st1.nextToken()); // �˰���� �л��� ��ȣ
			
			Double[] score = new Double[n];
			double search = 0.0;
			for(int i=0; i<n; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				
				int middle = Integer.parseInt(st2.nextToken());
				int finalt = Integer.parseInt(st2.nextToken());
				int addr = Integer.parseInt(st2.nextToken());
				
				score[i] = 0.35*middle + 0.45*finalt + 0.20*addr;
				
				if(i+1==k) {
					search = score[i];
				}
			}
			
			Arrays.sort(score, Collections.reverseOrder()); // ���
			
			// 20��
			// 7����
			// 30/10 => 3
			// 7/3+1 �����׷�... 
			int num = 0;
			for(int i=0; i<score.length; i++) {
				if(score[i] == search) {
					num = i/(n/10); // ���
				}
			}
			
			System.out.println("#"+t+" "+sc[num]);
			
		}
	}
}
