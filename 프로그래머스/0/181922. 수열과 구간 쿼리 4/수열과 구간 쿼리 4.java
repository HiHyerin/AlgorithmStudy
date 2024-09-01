class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int s = 0;
        int e = 0;
        int k = 0;
        
        for(int i=0; i<queries.length; i++) {
            int[] query = queries[i];
            s = query[0];
            e = query[1];
            k = query[2];
            for(int j=s; j<e+1; j++) {
                arr[j] = (j % k) == 0 ? arr[j] + 1 : arr[j];
            }
        }
        return arr;
    }
}