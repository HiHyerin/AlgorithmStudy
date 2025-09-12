class Solution {
    public int solution(int n) {
        String nBinary = Integer.toBinaryString(n);
        int nBinaryCnt = nBinary.replace("0","").length();
        
        while(true) {
            n ++;
            String binary = Integer.toBinaryString(n);
            int binaryCnt = binary.replace("0", "").length();
            if(binaryCnt == nBinaryCnt) {
                break;
            }
        }
        return n;
    }
}