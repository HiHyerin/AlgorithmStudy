import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        Arrays.fill(answer, "");
        int l = 0;
        for(int i=0; i<picture.length; i++) {
            String[] pic = picture[i].split("");
            for(int j=0; j<pic.length; j++) {
                for(int z=0; z<k; z++) {
                    answer[l] += pic[j];
                }
            }
            for(int s=1; s<k; s++) {
                answer[l+s] += answer[l];
            }
            l += k;
        }
        return answer;
    }
}