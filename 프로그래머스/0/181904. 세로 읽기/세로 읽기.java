import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i=0; i<my_string.length(); i+=m) {
            ArrayList list = new ArrayList();
            for(int j=0; j<m; j++) {
                list.add(my_string.charAt(i+j));
            }
            answer += list.get(c-1);
        }
        return answer;
    }
}