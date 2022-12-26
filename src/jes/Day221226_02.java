package jes;

//class Solution {
//    public long solution(int k, int d) {
//        long answer = 0;
//        return answer;
//    }
//}

public class Day221226_02 {
	public static void main(String[] args) {		
//		Solution solution = new Solution();
		
		long answer;
		answer = solution(2,4);
		System.out.println(answer);
		answer = solution(1,5);
		System.out.println(answer);
	}
    public static long solution(int k, int d) {
        long answer = 0;
        double result;
        for(int i =0; i<=d;i+=k) {
        	for(int j = 0; j<=d;j+=k) {
        		result =Math.sqrt(i*i+j*j);  
        		if(d>=result) {
        			answer+=1;
        		}
        	}
        }
        return answer;
    }
}