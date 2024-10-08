class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String[] arr = rny_string.split("");
        for(String s : arr) {
            if(s.equals("m")) {
                s = "rn";
            }
            answer += s;
        }
        return answer;
    }
}