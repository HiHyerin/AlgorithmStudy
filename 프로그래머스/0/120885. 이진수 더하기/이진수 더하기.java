import static java.lang.Integer.*;
class Solution {
    public String solution(String bin1, String bin2) {
        int tenBin1 = parseInt(bin1, 2);
        int tenBin2 = parseInt(bin2, 2);
        return Integer.toBinaryString(tenBin1 + tenBin2);
    }
}