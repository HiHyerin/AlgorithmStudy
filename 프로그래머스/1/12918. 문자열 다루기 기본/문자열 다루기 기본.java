class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] ch = s.toCharArray();
        if(ch.length != 4 && ch.length != 6) {
            return false;
        }
        for(char c:ch) {
            if(c >= 58) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}