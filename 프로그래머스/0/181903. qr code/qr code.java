class Solution {
    public String solution(int q, int r, String code) {
       String answer = "";
        for(int i=0; i<code.length(); i++) {
            char charCode = code.charAt(i);
            if(code.indexOf(charCode, i) % q == r) {
                answer += charCode;
            }
        }
        return answer;
    }
}