class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int i = 0;
        while(i<date1.length) {
            if(date1[i] == date2[i]) {
                i++;
            } else {
                if(date1[i] > date2[i]) {
                    return 0;
                } else {
                    return 1;
                }
                    
            }
        }
        return 0;
    }
}