import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList();
        
        if(k%2 == 1) {
            for(int a : arr) {
                list.add(a*k);
            }
        } else {
            for(int a : arr){
                list.add(a + k);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}