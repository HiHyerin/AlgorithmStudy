class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] stringArray = my_string.split("");
        String extra = stringArray[num1];
        stringArray[num1] = stringArray[num2];
        stringArray[num2] = extra;
        for(String s:stringArray) {
            answer += s;
        }
        return answer;
    }
}