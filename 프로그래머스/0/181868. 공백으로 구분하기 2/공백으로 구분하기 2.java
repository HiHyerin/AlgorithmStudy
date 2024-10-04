import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList();
        for(String a:answer) {
            if(!a.equals("")) {
                list.add(a);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}