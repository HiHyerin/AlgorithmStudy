import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            // 1. array를 [][0]부터 [][1]까지 자르기
            int[] arrayCopy = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 2. 오름차순 정렬
            Arrays.sort(arrayCopy);
            // 3. [][2]번째 숫자 answer에 넣기
            answer[i] = arrayCopy[commands[i][2]-1];
        }
        return answer;
    }
}