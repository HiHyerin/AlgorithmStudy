class Solution {
    public int solution(int n) {
        int mod = 1234567;
        int reNum = 1; // F(1)
        int reReNum = 0; // F(0)
        for(int i=0; i<=n-2; i++) {
            int temp = (reNum + reReNum) % mod;
            reReNum = reNum;
            reNum = temp;
        }
        return reNum;
    }
}