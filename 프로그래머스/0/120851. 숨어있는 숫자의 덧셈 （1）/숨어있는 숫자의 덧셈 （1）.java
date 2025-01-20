class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String regExp = "^[0-9]*$";
        for(String s:my_string.split("")){
            if(s.matches(regExp)) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}