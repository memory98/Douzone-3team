package jes;

class Solution {
	public Solution() {
	
	} 

	public int solution(String t, String p) {
		int answer=0;
		String[] arr = new String[t.length()-p.length() +1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] =t.substring(i,i+p.length());
			}
			for(String s:arr) System.out.println(s);
			for (int i1 = 0; i1 < arr.length; i1++) {
				if (Integer.parseInt(p) >= Integer.parseInt(arr[i1]))
					answer += 1;
			}
		return answer;
	}
}

public class Day221226_01 {
	public static void main(String[] args) {
		Solution solution = new Solution();

		int answer;
		answer = solution.solution("3141592", "271");
		System.out.println("기댓값 : 2");
		System.out.println(answer);
		answer = solution.solution("500220839878", "7");
		System.out.println("기댓값 : 8");
		System.out.println(answer);
		answer = solution.solution("10203", "15");
		System.out.println("기댓값 : 3");
		System.out.println(answer);
	}
}
