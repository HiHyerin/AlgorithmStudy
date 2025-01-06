class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n);
        for(String c : temp.split("")) {
            answer = answer + Integer.parseInt(c);
        }
        return answer;
    }
}