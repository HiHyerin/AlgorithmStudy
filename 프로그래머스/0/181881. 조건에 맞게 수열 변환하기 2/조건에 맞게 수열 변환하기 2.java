import java.util.*;
class Solution {
    public int solution(int[] arr) {
        ArrayList<int[]> answer = new ArrayList();
        for(int j=0; j<=999999; j++) {
            answer.add(Arrays.copyOf(arr, arr.length));
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i]%2==0) {
                    arr[i] /= 2;
                } else if(arr[i] <= 50 && arr[i]%2==1) {
                    arr[i] = arr[i] *2 + 1;
                }
             }
            if(j>=1 && Arrays.equals(answer.get(j), answer.get(j-1))) {
                return j-1;
            }
        }
        return 0;
        
    }
}