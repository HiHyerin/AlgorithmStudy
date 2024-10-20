class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(char s : num_str.toCharArray()) {
            answer += (s - '0');
        }
        return answer;
    }
}