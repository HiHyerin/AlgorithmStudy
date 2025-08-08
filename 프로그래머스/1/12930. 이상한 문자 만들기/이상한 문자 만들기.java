class Solution {
    public String solution(String s) {
        String answer = "";
        boolean change = true;
        for(String str : s.split("")) {
            if(str.equals(" ")) {
                answer += str;
                change = true;
            } else {
                if(change) {
                    answer += str.toUpperCase();
                    change = false;
                } else {
                    answer += str.toLowerCase();
                    change = true;
                }
            }
        }
        return answer;
    }
}