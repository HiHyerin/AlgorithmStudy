class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int num = 0;
        for(int i:absolutes) {
            if(signs[num]) {
                answer += i;
            } else {
                answer -= i;
            }
            num ++;
        }
        return answer;
    }
}