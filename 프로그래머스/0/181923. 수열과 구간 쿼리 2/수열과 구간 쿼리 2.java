class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int x = 0;
        
        for(int i=0; i<queries.length; i++) {
            for(int j= queries[i][0]; j<= queries[i][1]; j++){
                if(j > queries[i][2]) {
                    if(x < arr[j]) {
                        x = answer[i];
                    }
                }
            }
        }
        return answer;
    }
}