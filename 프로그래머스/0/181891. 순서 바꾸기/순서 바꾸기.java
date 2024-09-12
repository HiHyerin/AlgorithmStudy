import java.util.*;
class Solution {
    public ArrayList solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> answer = new ArrayList();
        for(int i=0; i<num_list.length; i++) {
            list.add(num_list[i]);
        }
        for(int i=n; i<list.size(); i++) {
            answer.add(list.get(i));
        }
        for(int i=0; i<n; i++) {
                answer.add(list.get(i));
        }
        
        return answer;
    }
}