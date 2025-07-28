import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1 == 0 ? 1 : arr.length-1];
        int min = arr[0];
        if(arr.length-1 == 0) {
            answer[0] = -1;
        } else {
            for(int i:arr) {
            if(min > i) {
                min = i;
            }
        }
        int num = 0;
        for(int i=0; i<answer.length; i++) {
            if(arr[i] != min) {
                answer[i] = arr[num];
            } else {
                num ++;
                answer[i] = arr[num];
            }
            num ++;
        }
        }
        
        return answer;
    }
}