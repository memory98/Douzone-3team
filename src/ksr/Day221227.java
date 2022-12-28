package ksr;

import java.util.HashSet;
import java.util.Set;

public class Day221227 {

	public static void main(String[] args) {
		long result = solution(1,5);
		System.out.println(result);

	}
	
	public static long solution(int k, int d) {
	    long answer = 0;

	    for(int i=0; i<=d ; i+=k){
	    	
	    	//answer += (int)Math.sqrt((long )(d + i) * (long)(d - i)) / k + 1;
	        //answer += (int)Math.sqrt((long)(d * d) - (long)(i * i)) / k + 1;
	    	answer += (Math.sqrt((d*d)-(i*i)) / k)+1;
	    }

	    return answer;
	}

}
