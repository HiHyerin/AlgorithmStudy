class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int x = 0;
        for(int i=0; i<array.length; i++) {
            if(i==0) {
                x = Math.abs(n - array[i]);
            } else {
                if(x > Math.abs(n-array[i])) {
                    x = Math.abs(n-array[i]);
                    answer = array[i];
                }
                if(x == Math.abs(n-array[i])) {
                    if(answer > array[i]) {
                        answer = array[i];
                    }
                }
            }
        }
        return answer;
    }
}