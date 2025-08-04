import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        List<Integer> nList = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                nList.add(i);
            }
        }
        for(int i=1; i<=m; i++) {
            if(m%i == 0) {
                mList.add(i);
            }
        }
        for(int i:nList) {
            for(int j:mList) {
                if(i==j && i> max) {
                    max = i;
                }
            }
        }
        
        for(int i=n; i<= n*m; i++) {
            if(i%n == 0 && i%m == 0) {
                min = i;
                break;
            }
        }
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}