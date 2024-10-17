import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        List<String> list = new ArrayList();
        List<Integer> list2 = new ArrayList();
        for(int i=0; i<strArr.length; i++) {
            list.add(String.valueOf(strArr[i].length()));
        }
        
         Set<String> set = new HashSet<String>(list);

        for(String str:set) {
            list2.add(Collections.frequency(list, str));
        }
        return Collections.max(list2);
    }
}