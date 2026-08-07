import java.math.BigInteger;
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        BigInteger n = new BigInteger(sb.toString());
        sb = new StringBuilder(String.valueOf(n));
        return sb.reverse().toString();
    }
}