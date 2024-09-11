import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        ArrayList<Integer> indicesList = new ArrayList();
        List list = new ArrayList();
        String answer = "";

        for(int i:indices) {
            indicesList.add(i);
        }
        indicesList.sort(Collections.reverseOrder());

        for(char chars:my_string.toCharArray()) {
            list.add(chars);
        }

        for(int i : indicesList) {
            list.remove(i);
        }

        for(Object s:list) {
            answer += s.toString();
        }
        return answer;
    }
}