class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = String.valueOf(age);
        for(char c:ageStr.toCharArray()) {
            char ageChar = (char) (c - '0' + 97);
            answer += ageChar;
        }
        return answer;
    }
}