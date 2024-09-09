import java.util.*;
class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        int strInt = 0;
        ArrayList<Integer> answer = new ArrayList();
        
        for(int i=0; i<intStrs.length; i++) {
            strInt = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(strInt > k) {
                answer.add(strInt);
            }
        }
        return answer;
    }
}