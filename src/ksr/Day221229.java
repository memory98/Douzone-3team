package ksr;

public class Day221229 {


	public static void main(String[] args) {
		int[] arr = {4, 1, 2,1};
		int value =solution(arr,4);
		
		System.out.println(value);
	
	}
	
	public static int solution(int[] numbers, int target) {
		int answer = 0;
		int result = 0;
		int result2 = 0;
		
		for(int i:numbers) {
			result += i ;
		}
		
		numbers[0]=numbers[0]*-1 ;
		for(int i:numbers) {
			result2 += i ;
		}
		
		if (numbers.length == 1) {
			if(result == target) {
				answer ++;
			}
		
			if(result2 == target) {
				answer ++;
			}
		}
		
		if (numbers.length > 1) {
			int[] temp = new int[numbers.length-1];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = numbers[j+1] ;
			}
			answer += solution(temp,(target+numbers[0]));
			answer += solution(temp,(target-numbers[0]));
			
		}
		
        return answer;
    }

}
