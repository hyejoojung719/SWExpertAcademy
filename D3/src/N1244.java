//import java.util.Scanner;
//
//// 최대상금
//public class N1244 {
//	
//	static int chance;
//	static int answer;
//	static String[] target;
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int tc  = Integer.parseInt(sc.nextLine());
//		
//		for(int test_case = 1; test_case<=tc; test_case++ ) {
//			String input = sc.nextLine();
//			String[] inputArr = input.split(" ");
//			
//			target = inputArr[0].split("");
//			chance = Integer.valueOf(inputArr[1]);
//			
//			answer = 0;
//			answer = dfs(0,0);
//			
//			System.out.println("#" + test_case + " " + anwser);
//		}
//	}
//	
//	static int dfs(int k, int count) {
//		String temp;
//		String targetNum = "";
//		
//		if(chance == count) {
//			// 교체 횟수 다 썼을 경우
//			for(String tmp: target) {
//				targetNum += tmp;
//			}
//			if(Integer.valueOf(targetNum)>answer) {
//				answer = Integer.valueOf(targetNum);
//			}
//			return answer;
//		}
//	}
//}
