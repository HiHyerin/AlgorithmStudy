class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int a = 0;
        for(int n:numbers) {
            answer[a] = 2 * n;
            a ++;
        }
        return answer;
    }
}