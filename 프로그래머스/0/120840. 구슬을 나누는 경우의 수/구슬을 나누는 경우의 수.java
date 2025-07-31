import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        BigInteger n = new BigInteger("1");
        BigInteger m = new BigInteger("1");;
        for(int i=0; i<balls-share; i++) {
            n = n.multiply(BigInteger.valueOf((balls-i)));
            m = m.multiply(BigInteger.valueOf((balls-share-i)));
        }

        return Integer.parseInt(String.valueOf(n.divide(m)));
    }
}