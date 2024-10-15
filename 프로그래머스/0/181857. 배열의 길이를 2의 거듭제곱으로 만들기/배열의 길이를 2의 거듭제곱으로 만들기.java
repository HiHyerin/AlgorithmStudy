import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList();
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        int j=0;
        while(true) {
            if(list.size() == Math.pow(2,j)) {
                break;
            } else if(list.size() > Math.pow(2,j)) {
                j++;
            } else {
                list.add(0);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}