
import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] lowScore = new int[score.length];
        List<Integer> dataList = new ArrayList<>();
        if(k <= score.length) {
            for(int i=0; i<k; i++) {
                dataList.add(score[i]);
                dataList.sort(Comparator.naturalOrder());
                lowScore[i] = dataList.get(0);
            }

            for(int i=k; i<score.length; i++) {
                if(score[i] > dataList.get(0)) {
                    dataList.set(0, score[i]);
                    dataList.sort(Comparator.naturalOrder());
                    lowScore[i] = dataList.get(0);
                }
                lowScore[i] = dataList.get(0);
            }
        } else {
            for(int i=0; i<score.length; i++) {
                dataList.add(score[i]);
                dataList.sort(Comparator.naturalOrder());
                lowScore[i] = dataList.get(0);
            }
        }
        return lowScore;
    }
}