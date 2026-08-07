//  import java.math.BigInteger;
class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length()- 1;
        while(i >= 0 && num.charAt(i) == '0'){
            i--;
        }
        return num.substring(0, i+1);
        // StringBuilder sb = new StringBuilder(num);
        // sb.reverse();
        // BigInteger n = new BigInteger(sb.toString());
        // sb = new StringBuilder(String.valueOf(n));
        // return sb.reverse().toString();
    }
}