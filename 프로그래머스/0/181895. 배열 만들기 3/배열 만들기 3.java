import java.util.*;
class Solution {
    public ArrayList solution(int[] arr, int[][] intervals) {
        ArrayList answer = new ArrayList();
        for(int[] interval : intervals) {
            for(int i=interval[0]; i<=interval[1]; i++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}