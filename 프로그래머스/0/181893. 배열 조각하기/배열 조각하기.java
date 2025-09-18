import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> temp = new ArrayList<>();
        for (int a : arr) {
            temp.add(a);
        }

        for(int i=0; i<query.length; i++) {
            if(i % 2 == 0) {
                temp = temp.subList(0, query[i]+1);
            } else {
                temp = temp.subList(query[i], temp.size());
            }
        }
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}