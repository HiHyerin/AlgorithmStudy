class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        int num=0;
        
        if(length % 2 == 0) {
            num = 1;
        } 
        
        for(int i=num; i<length; i+=2) {
            arr[i] += n;
        }
        return arr;
    }
}