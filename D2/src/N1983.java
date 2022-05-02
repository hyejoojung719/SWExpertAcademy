import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 조교의 성적 매기기
public class N1983 {
	static String[] sc = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
	public static void main(String[] args) throws Exception{
		// 총점 = 중간 35% + 기말 45% + 과제 20%
		// 총점순으로 10개의 평점 부여
		// N/10애개 동일한 평점 부여 가능
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		
		for(int t=1; t<=tc; t++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st1.nextToken()); // 학생수
			int k = Integer.parseInt(st1.nextToken()); // 알고싶은 학생의 번호
			
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
			
			Arrays.sort(score, Collections.reverseOrder()); // 요기
			
			// 20명
			// 7번쨰
			// 30/10 => 3
			// 7/3+1 번쨰그룹... 
			int num = 0;
			for(int i=0; i<score.length; i++) {
				if(score[i] == search) {
					num = i/(n/10); // 요기
				}
			}
			
			System.out.println("#"+t+" "+sc[num]);
			
		}
	}
}
