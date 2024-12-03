import java.util.*;
class Solution {
    public long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        String answer = "";
        for(int i=c.length-1; i>= 0; i--) {
            answer += c[i];
        }
        
        return Long.valueOf(answer);
    }
}