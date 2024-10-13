import java.util.*;
class Solution {
    public List solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        List list = new ArrayList();
        for(int i=0; i<arr.length; i++) {
            if(flag[i]) {
                int repeatNum = arr[i] * 2;
                for(int j=0; j<repeatNum; j++) {
                    list.add(arr[i]);
                }
            } else {
                list = list.subList(0, list.size()-arr[i]);
            }
        }
        return list;
    }
}