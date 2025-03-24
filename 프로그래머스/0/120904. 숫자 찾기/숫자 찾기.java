class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String numStr = Integer.toString(num);
        for(char c:numStr.toCharArray()) {
            if(c - '0' == k) {
                return answer;
            } else {
                answer ++;
            }
        }
        return -1;
    }
}