import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[][] avg = new double[score.length][2];
        int order = 1;
        for (int i = 0; i < score.length; i++) {
            avg[i][0] = (double)(score[i][0] + score[i][1]) / 2;
            avg[i][1] = i;
        }
        Arrays.sort(avg, Comparator.comparingDouble((double[] a) -> a[0]).reversed());


        for(int i=0; i<score.length; i++) {
            if(i!=0 && avg[i][0] == avg[i-1][0]) {
                answer[(int) avg[i][1]] = answer[(int) avg[i-1][1]];
            } else {
                answer[(int) avg[i][1]] = order;
            }
            order ++;
        }
        
        return answer;
    }
    
}