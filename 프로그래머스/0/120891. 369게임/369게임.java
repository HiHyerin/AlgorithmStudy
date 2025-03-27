class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);
        for(char c : strOrder.toCharArray()) {
            if (c-'0' == 3 || c-'0' == 6 || c-'0' == 9) {
                answer ++;
            }
        }
        return answer;
    }
}