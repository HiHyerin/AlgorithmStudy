class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=10; i++) {
            int num = 1;
            for(int j=i; j>=1; j--) {
                num *= j;
            }
            if(num == n) {
                return i;
            } else if(num > n) {
                return i-1;
            }
        } 
        return 0;
    }
}