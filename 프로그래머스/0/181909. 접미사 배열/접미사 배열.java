import java.util.*;
class Solution {
    public ArrayList solution(String my_string) {
        char[] chars = my_string.toCharArray();
        ArrayList answer = new ArrayList();

        for (int i=0; i<chars.length; i++) {
            answer.add(my_string.substring(i));
        }
        Collections.sort(answer);
        return answer;
    }
}