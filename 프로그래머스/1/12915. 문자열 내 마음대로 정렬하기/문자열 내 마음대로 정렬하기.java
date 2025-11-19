import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        int[][] arrs = new int[strings.length][2];
        String[] answer = new String[strings.length];

        for(int i=0; i<strings.length; i++) {
            arrs[i][0] = strings[i].charAt(n);
            arrs[i][1] = i;
        }

        Arrays.sort(arrs, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return CharSequence.compare(strings[o1[1]], strings[o2[1]]);
            }
            return Integer.compare(o1[0], o2[0]);
        });
        
        int i = 0;
        for(int[] arr : arrs) {
            answer[i] = strings[arr[1]];
            i++;
        }
        
        return answer;
    }
}