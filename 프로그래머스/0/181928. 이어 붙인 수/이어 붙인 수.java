class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String evenValue = "";
        String oddValue = "";
        for(int index : num_list) {
            if(index % 2 == 0) {
                evenValue += index;
            } else {
                oddValue += index;
            }
        }
        return Integer.parseInt(evenValue) + Integer.parseInt(oddValue);
    }
}