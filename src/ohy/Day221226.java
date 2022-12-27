package ohy;

public class Day221226 {

	public static void main(String[] args) {
		
	}
	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        int t_len = t.length();
	        int p_len = p.length();
	        
	       for(int i = 0; i < t_len-p_len+1; i++){
	            if (Long.valueOf(t.substring(i,i+p_len)) <= Long.valueOf(p)){
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
	// p보다 작거나 같은 수 찾기
	// Integer.valueOf : String -> int
	// substring : 문자열 자르기

}
