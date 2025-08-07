class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int order = 0;
        while(true) {
            order = chicken/10;
            chicken = order + chicken%10;
            answer += order;
            if(chicken<10) {
                break;
            }
        }
        return answer;
    }
}