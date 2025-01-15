class Solution {
    public int solution(int hp) {
        int remainder1 = hp % 5;
        int remainder2 = remainder1 % 3;
        int res = ((3*hp) + (2*remainder1) + (10*remainder2)) % 15;
        int answer = ((3*hp) + (2*remainder1) + (10*remainder2)) / 15;
        return answer;
    }
}