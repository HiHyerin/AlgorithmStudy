import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++) {
            if(a[i%a.length] == answers[i]) {
                cnt[0] ++;
            }
            if(b[i%b.length] == answers[i]) {
                cnt[1] ++;
            }
            if(c[i%c.length] == answers[i]) {
                cnt[2] ++;
            }
        }
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] == max) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}