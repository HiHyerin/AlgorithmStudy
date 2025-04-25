class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
            int a = 0;
        for(int i=0; i<num_list.length; i+=n) {
            for(int j=0; j<n; j++) {
                answer[a][j] = num_list[i];
                i += 1;
            }
            i -= n;
            a += 1;
        }
        return answer;
    }
}