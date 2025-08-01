import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int cnt = 0;
        int line = sides[1];
        
        while(true) { // sides[1]이 제일 긴 변
            if(sides[1]<(sides[0]+line)) {
                line --;
                cnt ++;
            } else {
                break;
            }
        }
        line = sides[1] + 1;
        while(true) { // line이 제일 긴 변
            if(line<(sides[0]+sides[1])) {
                line++;
                cnt++;
            } else {
                break;
            }
        }
        return cnt;
    }
}