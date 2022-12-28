package jes;

public class Day221226_02 {
	public static void main(String[] args) {
//		Solution solution = new Solution();

		long answer;
		answer = solution(2, 4);
		System.out.println(answer);
		answer = solution(1, 5);
		System.out.println(answer);
	}
	
	public static long solution(int k, int d) {
		long answer = 0;
		
		for (int i = 0; i <= d; i += k) {
			long len = (long)d*d -(long) i*i;
			answer += ((long)Math.sqrt(len))/k+1;
			System.out.println("len : ["+len+"], answer : ["+answer+"]"+", Math.sqrt(len) : "+Math.sqrt(len)+", (long)Math.sqrt(len) : "+(long)Math.sqrt(len));
		}
		return answer;
	}
}
