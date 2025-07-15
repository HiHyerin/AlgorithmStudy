import java.util.*;
class Solution {
    public int[] solution(int n) {
        int n2 = n;
        Set<Integer> cd = new HashSet<>();
        for(int i=2; i<=n; i++) {
            while(true) {
                if(n2%i == 0) {
                    cd.add(i);
                    n2 = n2/i;
                } else {
                    break;
                }
            }
        }
        Integer[] arr = cd.toArray(new Integer[0]);
        int[] answer = new int[cd.size()];

        for(int i=0; i<cd.size(); i++) {
            answer[i] = arr[i];
        }
        
        Arrays.sort(answer);
        return answer;
    }
}