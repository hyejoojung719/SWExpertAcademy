import java.util.Scanner;

// 신문 헤드라인
public class N2047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String output ="";
		int tmp;
		
		for(int i=0; i<input.length(); i++) {
			tmp = (int)input.charAt(i);
			if(tmp >=97 && tmp <= 122 ) {
				tmp -= 32;
			}
			output += (char)tmp;
		}
		
		System.out.println(output);
	}
}
