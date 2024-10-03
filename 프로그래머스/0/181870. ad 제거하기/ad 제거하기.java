import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        for(String str:strArr) {
            if(str.contains("ad")) {
                list.remove(str);
            }
        }
        int listSize = list.size();
        String[] answer = list.toArray(new String[listSize]);
        return answer;
    }
}