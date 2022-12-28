package ksr;

public class Day221227 {

	public static void main(String[] args) {
		long result = solution(2,4);
		System.out.println(result);

	}
	
	public static long solution(int k, int d) {
	    long answer = 0;
	    
	    for(int i=0; i<=d ; i+=k){
	        for(int j=0; j<=d; j+=k){
	            if(((i*i)+(j*j)) > (d*d)){
	                continue;
	            }
	            answer ++;
	        }
	    }
	    return answer;
	}

}
