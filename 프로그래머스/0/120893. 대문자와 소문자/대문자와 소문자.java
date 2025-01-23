class Solution {
    public String solution(String my_string) {
        String answer = "";
        String regSletter = "^[a-z]*$";
        
        for(String s:my_string.split("")) {
            if(s.matches(regSletter)) {
                answer += s.toUpperCase();
            } else {
                answer += s.toLowerCase();
            }
        }
        return answer;
    }
}