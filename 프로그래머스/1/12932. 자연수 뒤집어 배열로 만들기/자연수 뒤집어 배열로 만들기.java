class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(n).substring(length-1, length));
            length --;
        }
        return answer;
    }
}