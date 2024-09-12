import java.util.*;
class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList answer = new ArrayList();
        ArrayList list = new ArrayList();
        
        for(int i:arr) {
            list.add(i);
        }
        
        int firstIdx = list.indexOf(2);
        int lastIdx = list.lastIndexOf(2);
        
        if(firstIdx != -1 && lastIdx != -1) {
            for(int i=firstIdx; i<=lastIdx; i++) {
                answer.add(list.get(i));
            }
        }
        
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer;
    }
}