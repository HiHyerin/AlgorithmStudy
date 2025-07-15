class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String arrayToStr = "";
        for(int n:array) {
            arrayToStr += n;
        }
        for(char c:arrayToStr.toCharArray()) {
            if(c == '7') {
                answer ++;
            }
        }
        return answer;
    }
}