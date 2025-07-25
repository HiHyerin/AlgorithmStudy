class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int smallNum = Math.min(a, b);
        int bigNum = Math.max(a, b);
        for(int i=smallNum; i<=bigNum; i++) {
            answer += i;
        }
        return answer;
    }
}