package shb;

import java.io.*;

public class Day221226 {
	
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String t = br.readLine();
        String p = br.readLine();
        
        Solution sol = new Solution();
        
        bw.write(String.valueOf(sol.solution(t, p)));
        bw.close();
    }
}


class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <t.length()-p.length()+1; i++) {
            int tNum = Integer.parseInt(t.substring(i, i + p.length()));
            int pNum = Integer.parseInt(p);

            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}