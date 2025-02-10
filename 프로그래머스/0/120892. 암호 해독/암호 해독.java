class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] stringArray = cipher.split("");
        for(int i=1; i<=cipher.length()/code; i++) {
            answer += stringArray[i*code-1];
        }
        return answer;
    }
}