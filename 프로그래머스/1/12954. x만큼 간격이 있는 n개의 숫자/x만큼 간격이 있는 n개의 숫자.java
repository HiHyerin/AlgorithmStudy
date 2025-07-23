import java.util.*;
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        long x2 = x;
        for(int i=0; i<n; i++) {
            answer[i] = x2;
            x2 += num;
        }
        
        return answer;
    }
}