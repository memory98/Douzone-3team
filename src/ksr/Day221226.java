package ksr;

import java.util.Scanner;

public class Day221226 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		String t = scanner.nextLine();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		String p = scanner.nextLine();
		int cnt =solution(t,p);
		
		System.out.println(cnt);
		
		
	}
	
	// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
	public static int solution(String t, String p) {
		
		int result = 0;
		
		int cnt= (t.length()-p.length())+1 ;
		
		for(int i=0 ; i<cnt;i++) {
			if(Integer.parseInt(t.substring(i, i+p.length())) <=Integer.parseInt(p)) {
				result += 1;
			}
		}
		
		return result;
	}

}
