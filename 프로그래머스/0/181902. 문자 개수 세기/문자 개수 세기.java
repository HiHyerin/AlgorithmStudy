class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int i = 0;
        for(char c='A'; c<='Z'; c++) {
            for(char c2:my_string.toCharArray()) {
                if(c == c2) {
                    answer[i]++;
                }
            }
            i++;
        }
        for(char c='a'; c<='z'; c++) {
            for(char c2:my_string.toCharArray()) {
                if(c == c2) {
                    answer[i]++;
                }
            }
            i++;
        }
        return answer;
    }
}