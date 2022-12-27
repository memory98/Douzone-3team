package ohy;

import java.util.Scanner;

public class Day221226 {

	public static int main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String t = scanner.nextLine();
		String p = scanner.nextLine();
		return Solution(t,p);
	}



private static int Solution(String t, String p) {
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
