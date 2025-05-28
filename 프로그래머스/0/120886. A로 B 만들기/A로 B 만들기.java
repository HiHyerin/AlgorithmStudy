import java.util.*;
class Solution {
    public int solution(String before, String after) {
        List beforeList = Arrays.asList(before.split(""));
        List afterList = Arrays.asList(after.split(""));
        
        beforeList.sort(Comparator.naturalOrder());
        afterList.sort(Comparator.naturalOrder());

        if(beforeList.equals(afterList)) {
            return 1;
        }
        return 0;
    }
}