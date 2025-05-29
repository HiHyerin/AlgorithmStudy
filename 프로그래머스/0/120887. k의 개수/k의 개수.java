class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int l = i; l <= j; l++) {
            if(l < 10) {
                if(l == k) {
                    answer ++;
                }
            } else {
                for(String s:String.valueOf(l).split("")) {
                    if(s.equals(String.valueOf(k))) {
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}