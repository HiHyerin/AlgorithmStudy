import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> trueList = new ArrayList<>();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                trueList.add(new int[]{rank[i], i});
            }
        }
        
        trueList.sort(Comparator.comparingInt(a -> a[0]));
        
        int[] a = trueList.get(0);
        int[] b = trueList.get(1);
        int[] c = trueList.get(2);
        
       return 10000*a[1] + 100*b[1] + c[1];
    }
}