class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int temp = 0;
        for(int i=0; i<queries.length; i++) {
            for(int j=0; j<queries[i].length-1; j++) {
                temp = arr[queries[i][j]];
                arr[queries[i][j]] = arr[queries[i][j+1]];
                arr[queries[i][j+1]] = temp;
            }
        }
        return arr;
    }
}