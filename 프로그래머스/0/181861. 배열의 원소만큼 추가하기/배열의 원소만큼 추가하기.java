import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i : arr) {
            for(int j=0; j< i; j++) {
                answer.add(i);
            }
        }
        return answer.toArray(new Integer[answer.size()]);
    }
}