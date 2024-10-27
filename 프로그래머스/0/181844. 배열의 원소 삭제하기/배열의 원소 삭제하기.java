import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List list= new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }
        for(int n : arr) {
            for(int d : delete_list) {
                if(n == d) {
                    list.remove(list.indexOf(n));
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i).toString());
        }
        
        return answer;
    }
}