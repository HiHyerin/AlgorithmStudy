class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split("");
        java.util.Arrays.sort(words);
        for (int i = words.length - 1; i >= 0; i--) {
            answer += words[i];
        }
        return answer;
    }
}